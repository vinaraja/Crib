/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vinay
 */
@WebServlet(urlPatterns = {"/New_friend"})
public class New_friend extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        response.setContentType("text/html;charset=UTF-8");
       String name = request.getParameter("searchname");
       String user=request.getParameter("mainuser");
        String firstname=request.getParameter("mainuser_firstname");
       
       //System.out.println(user);
       try (PrintWriter out = response.getWriter()){
          
        String connectionURL = "jdbc:derby://localhost:1527/WTFtask";
        try{
            
            Connection conn = DriverManager.getConnection(connectionURL, "IS2560","IS2560");
            
            String query1="SELECT * FROM WTFuser where FIRSTNAME = '"+name+"'";
            
            Statement st1 = conn.createStatement();
            ResultSet rs = st1.executeQuery(query1);
            System.out.println("inside last try");
            boolean flag=rs.next();
            System.out.println(flag+" hahahahhaha");
            String username=rs.getString("username");
            System.out.println(username+" blalalalla");
            
            String query="INSERT INTO WTFFriends (mainusername,friendname) VALUES ( '"+user+"' , '"+username+"' )";
            
            System.out.println("inside");
            Statement st = conn.createStatement();
              st.executeUpdate(query);
            
               request.setAttribute("Name",firstname );
               request.setAttribute("username",user);
               request.setAttribute("FName",name);
            RequestDispatcher rd=request.getRequestDispatcher("user_home.jsp");
            
            request.setAttribute("added_friend","true");
            rd.forward(request, response);
            st.close();
            st1.close();
            conn.close();
            
        }
        catch(SQLException ex)
        {
            response.getWriter().write("false");
            out.print("Connection Failed!"); 
        }
       }
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
