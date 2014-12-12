/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import dao.userDao;
import domain.userInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import validity.PasswordService;
import validity.registerValidation;

public class registerController extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) 
        {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet registerController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet registerController at " + request.getContextPath() + "</h1>");
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
            throws ServletException, IOException 
    {
        
        //processRequest(request, response);
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
        String userName=request.getParameter("userName");
        String fullName=request.getParameter("fullName");
        String password=request.getParameter("password");
        String passwordConfirm=request.getParameter("confirmpassword");
        String mobile=request.getParameter("mobile");
        String email=request.getParameter("email");
        String bankName=request.getParameter("bankName");
        String bankAccount=request.getParameter("bankAccount");
        try 
        {
        userInfo user=new userInfo();
        user.setuserID(userName);
        PasswordService ps=new PasswordService();
        user.setuserPassword(ps.encrypt(password));
        user.setuserName(fullName);
        user.setuserMobile(mobile);
        user.setuserEmail(email);
        user.setuserBankName(bankName);
        user.setuserBankAccount(bankAccount);
        passwordConfirm=ps.encrypt(passwordConfirm);
        userDao userConnection=userDao.getInstance();
        boolean flag=registerValidation.regValid(user, passwordConfirm);
        if(flag==true)
        {
            flag=userConnection.InsertUser(user);
            if(flag==true)
            {
                System.out.println("Successfully!!!!! Added!!!!");
                response.sendRedirect("index.jsp");
            }
            else
            {
                System.out.println("Database add problem!!! ");
                response.sendRedirect("register.jsp");
            }
                    
        }
        else
        {
            System.out.println("Already added!! userID!!!");
        }
        
        
        } 
        catch (Exception ex) {
            Logger.getLogger(registerController.class.getName()).log(Level.SEVERE, null, ex);
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
