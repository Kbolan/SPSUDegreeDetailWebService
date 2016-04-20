/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import webPack.serv.*;
/**
 *
 * @author Pwner
 */
@WebServlet(urlPatterns = {"/SPSUDegreeDetailServlet"})
public class SPSUDegreeDetailServlet extends HttpServlet {
    SPSUDegreeDetailWebService service = new SPSUDegreeDetailWebService();
    SPSUDegreeDetailWebServiceSoap soap = service.getPort(SPSUDegreeDetailWebServiceSoap.class);
    
    
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
            String selected = request.getParameter("degreeDropdown");
            String selectedText = selected.toString();
            String output = null;
            
            if(selected.equals("CSBA")){
                output = "<h2>Computer Science Bachelor of Art: </h2>" + soap.csba();
            }
            if(selected.equals("CSBS")){
                output = "<h2>Computer Science Bachelor of Science: </h2>" + soap.csbs();
            }
            if(selected.equals("CETBS")){
                output = "<h2>Computer Engineering Technology Bachelor of Science: </h2>" + soap.cetbs();
            }
            if(selected.equals("ITBS")){
                output = "<h2>Information Technology Bachelor of Science: </h2>" + soap.itbs();
            }
            if(selected.equals("SWEBS")){
                output = "<h2>Software Engineering Bachelor of Science: </h2>" + soap.swebs();
            }
            if(selected.equals("CSMS")){
                output = "<h2>Computer Science Master of Science: </h2>" + soap.csms();
            }
            if(selected.equals("ITMS")){
                output = "<h2>Information Technology Master of Science: </h2>" + soap.itms();
            }
            if(selected.equals("SWEMS")){
                output = "<h2>Software Engineering Master of Science: </h2>" + soap.swems();
            }
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println(output);
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
