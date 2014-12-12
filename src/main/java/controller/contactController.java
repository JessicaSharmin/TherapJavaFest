/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dao.queryDao;
import domain.queryInfo;
import domain.userInfo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class contactController extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet contactController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet contactController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
            throws ServletException, IOException 
    {
        userInfo user=(userInfo)request.getSession().getAttribute("user");
        request.getSession().setAttribute("user",user);
        String userName=(String)request.getSession().getAttribute("userID");
        String fullName;
        String email;
        if(userName.equals("anonymous"))
        {
            fullName=request.getParameter("name");
            email=request.getParameter("email");
        }
        else
        {
            
            fullName=(String)request.getSession().getAttribute("name");
            email=(String)request.getSession().getAttribute("email");
        }
        String message=request.getParameter("comments");
        String subject=request.getParameter("subject");
        System.out.println("id="+userName);
        queryDao query=queryDao.getInstance();
        queryInfo q=new queryInfo();
        q.setclientName(fullName);
        q.setclientUsername(userName);
        q.setemail(email);
        q.setmessage(message);
        q.setquerySubject(subject);
        boolean flag=query.InsertPlace(q);
        if(flag==true)
        {
            request.setAttribute("message", "Successfully!! Send!!!");
           response.sendRedirect("message.jsp");
        }
        else
        {
            request.setAttribute("message", "Failed to Send!!!");
            //response.sendRedirect("message.jsp");
        }
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
