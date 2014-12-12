/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import Cost_decoration.costGet;
import Cost_decoration.packageData;
import dao.bookingDao;
import domain.bookingInfo;
import domain.userInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import validity.bookingIDgeneration;


public class bookingWeddingController extends HttpServlet {

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
            out.println("<title>Servlet bookingWeddingController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet bookingWeddingController at " + request.getContextPath() + "</h1>");
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
        String PackageID=request.getParameter("package");
        String placeID=request.getParameter("place");
        String photographerID=request.getParameter("photographer");
        String transportID=request.getParameter("transport");
        String foodID=request.getParameter("food");
        String decorationID=request.getParameter("decoration");
        String type=request.getParameter("wedbookingtype");
        String startTime = "null",endTime = "null",bookingID = null;
        System.out.println("abcdef");
        double cost = 0;
        bookingDao booking=bookingDao.getInstance();
        bookingInfo book=new bookingInfo();
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
   
        Calendar calobj = Calendar.getInstance();
        String date=df.format(calobj.getTime());
       
        if(type.equals("complete"))
        {
            
            book.setDate(date);
            book.setEndDate(endTime);
            book.setStartDate(startTime);
            //book.setbookingCost(cost);
            book.setbookingID(bookingIDgeneration.bookingIDgenerate());
            
            book.setdecorationID("null");
            book.setfoodID("null");
            book.setpackageID(PackageID);
            book.setphotographerID("null");
            book.setplaceID("null");
            book.settransportID("null");
            book.settype("WEDDING");
            book.setuserID("abcd");
          
        }
        else
        {
            book.setDate(date);
            book.setEndDate(endTime);
            book.setStartDate(startTime);
            book.setbookingID(bookingIDgeneration.bookingIDgenerate());
            book.setdecorationID(decorationID);
            book.setfoodID(foodID);
            book.setpackageID("CUSTOM");
            book.setphotographerID(photographerID);
            book.setplaceID(placeID);
            book.settransportID(transportID);
            book.settype("WEDDING");
            book.setuserID("abcd");
        }
        
        packageData data=costGet.costGet(book.getpackageID(), book.getdecorationID(), book.getfoodID(), book.getphotographerID(), book.getPlaceID(), book.gettransportID());
        book.setbookingCost(data.getCost());
        bookingDao bookInfo=bookingDao.getInstance();
        bookInfo.InsertDecorator(book);
        String bId= book.getbookingID();
        request.getSession().setAttribute("booking",bId);
        response.sendRedirect("bookingWedding.jsp"); 
       
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
