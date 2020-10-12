/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rac.servlet;

import com.rac.controller.commonConstants;
import com.rac.daoimpl.CustomerDaoImpl;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author personal
 */
@WebServlet(name = "static_admin_login", urlPatterns = {"/static_admin_login"})
public class static_admin_login extends HttpServlet {

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
        try {
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            String uname = "";
            String password = "";

            uname = request.getParameter("uname");
            password = request.getParameter("pw");

            if (uname.equalsIgnoreCase("admin") && password.equalsIgnoreCase("123")) {
                response.sendRedirect("dashboard.jsp");
            } else {
                ArrayList<String[]> AttributeConditionValue = new ArrayList<>();
                String[] ACV1 = {"customer_email", commonConstants.Sql.EQUAL, uname};
                AttributeConditionValue.add(ACV1);

                String[] ACV2 = {"customer_detail", commonConstants.Sql.EQUAL, password};
                AttributeConditionValue.add(ACV2);

                ResultSet rset = new CustomerDaoImpl().GetCustomerByMoreAttributes(AttributeConditionValue, commonConstants.Sql.AND);
                boolean status = false;

                if (rset.next()) {
                    status = true;
                } else {
                    status = false;
                }
                HttpSession session = request.getSession();
                if (status) {
                    session.setAttribute("uname", uname);
                }
                response.sendRedirect("home.jsp");
            }

        } catch (SQLException ex) {
            Logger.getLogger(static_admin_login.class.getName()).log(Level.SEVERE, null, ex);
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
