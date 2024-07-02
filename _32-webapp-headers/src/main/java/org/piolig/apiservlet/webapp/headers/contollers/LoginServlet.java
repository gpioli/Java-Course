package org.piolig.apiservlet.webapp.headers.contollers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    final static String USERNAME = "admin";
    final static String PASSWORD = "12345";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (USERNAME.equals(username) && PASSWORD.equals(password)) {

            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("    <head>");
                out.println("        <meta charset=\"UTF-8\">");
                out.println("        <title>  Successful login! </title>");
                out.println("    </head>");
                out.println("    <body>");
                out.println("        <h1> Successful login! </h1>");
                out.println("        <h3> Hello " + username + ". You hace successfully logged in! </h3>");
                out.println("    </body>");
                out.println("</html>");
            }

        } else {
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Sorry, not authorized.");
        }
    }

}

