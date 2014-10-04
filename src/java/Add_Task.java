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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aashish
 */
@WebServlet(urlPatterns = {"/Add_Task"})
public class Add_Task extends HttpServlet {

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
        String Tname=request.getParameter("taskname").replaceAll(" ","");
        String Tpoints=request.getParameter("taskpoints").replaceAll(" ","");
        String Tduedate=request.getParameter("duedate").replaceAll(" ","");
        String[] assignees = request.getParameterValues("list");
        
        try (PrintWriter out = response.getWriter()) {
            String connectionURL = "jdbc:derby://localhost:1527/WTFtask";
        try{
            Connection conn = DriverManager.getConnection(connectionURL, "IS2560","IS2560");
            Statement stmt=conn.createStatement();
            String query3 = "INSERT INTO IS2560.WTFtasks (TASKNAME,TASKPOINTS,DUEDATE) VALUES ('"+Tname+"','"+Tpoints+"','"+Tduedate+"')";
            stmt.executeUpdate(query3);
            String query4 = "SELECT * FROM IS2560.WTFtasks WHERE TASKNAME='"+Tname+"'";
            System.out.println("here");
            ResultSet rs = stmt.executeQuery(query4);
            rs.next();
            int id = rs.getInt("TaskID");
            for(int i=0;i<assignees.length;i++) {
                String query5 = "SELECT * FROM WTFuser WHERE FIRSTNAME='"+assignees[i]+"'";
                rs = stmt.executeQuery(query5);
                rs.next();
                String query6 = "INSERT INTO WTFTASKALLOCATION VALUES ("+id+",'"+rs.getString("USERNAME")+"')";
                stmt.executeUpdate(query6);
            }
            stmt.close();
            out.print("Connection Successful!");
            request.setAttribute("Name",Tname+" added successfully");
            RequestDispatcher rd=request.getRequestDispatcher("user_home.jsp");
            rd.forward(request, response);
            conn.close();
        }
        catch(SQLException ex)
        {
            out.print(ex+"Connection Failed!");
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
