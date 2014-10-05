

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author visheshtalreja
 */
@WebServlet(urlPatterns = {"/Add_Friend"})
public class Add_Friend extends HttpServlet {

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
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String sender_name = request.getParameter("user").replaceAll(" ","");
        String receiver_fname = request.getParameter("firstname").replaceAll(" ","");
        String receiver_lname = request.getParameter("lastname").replaceAll(" ","");
        String to = request.getParameter("email").replaceAll(" ","");
        out.print(sender_name);
        String user = "crib.notifications@gmail.com";
        String pass = "firewaterthunder";
        String sub = "You Friend "+user+" wants you to join CRIB";
        String body = "Hi "+receiver_fname+" "+receiver_lname+", Your friend"+sender_name+"wants you to join CRIB. CRIB is a portal where you and your friends can manage household chores and make sure that your house is clean at all times. Click on http://localhost:8080/WTF-task/task_login.jsp to join CRIB.";
        Properties props = new Properties();
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port","587");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable","true");
        
        Session session = Session.getInstance(props, new javax.mail.Authenticator() {
@Override
protected PasswordAuthentication getPasswordAuthentication(){return new PasswordAuthentication(user,pass);}});
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(sub);
            message.setText(body);
            
            Transport.send(message);
        }
        catch(Exception e){
            e.printStackTrace();
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