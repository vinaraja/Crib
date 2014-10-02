

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
import javax.mail.*;
import static javax.mail.Message.RecipientType.TO;
import static javax.mail.Session.getInstance;
import static javax.mail.Transport.send;
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
        final String user = "crib.notifications@gmail.com";
        final String pass = "firewaterthunder";
        String to = "aashishkanade@gmail.com";
        String sub = "Checking servlet";
        String body = "And the Servlet Works";
        Properties props = new Properties();
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.port","587");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.starttls.enable","true");
        
        Session session = getInstance(props, new javax.mail.Authenticator() {
@Override
protected PasswordAuthentication getPasswordAuthentication(){return new PasswordAuthentication(user,pass);}});
        try{
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(user));
            message.addRecipient(TO, new InternetAddress(to));
            message.setSubject(sub);
            message.setText(body);
            
            send(message);
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