package org.piolig.apiservlet.form;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet("/registry")
public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        String[] programmingLanguages = req.getParameterValues("languages");
        String[] roles = req.getParameterValues("role");

        String language = req.getParameter("language");
        String enable = req.getParameter("enable");
        String secret = req.getParameter("secret");

        resp.setContentType("text/html");
        try (PrintWriter out = resp.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("    <head>");
            out.println("        <meta charset=\"UTF-8\">");
            out.println("        <title> Form result </title>");
            out.println("    </head>");
            out.println("    <body>");
            out.println("        <h1> Form result! </h1>");

            out.println("    <ul>");
            out.println("        <li>Username: " + username + "</li>");
            out.println("        <li>Password: " + password + "</li>");
            out.println("        <li>Email: " + email + "</li>");
            out.println("        <li>Country: " + country + "</li>");
            out.println("        <li>Languages: <ul>");
            Arrays.asList(programmingLanguages).forEach(programmingLanguage -> {
                out.println("              <li>" + programmingLanguage + "</li>");
            });
            out.println("            </ul></li>");

            out.println("        <li>Roles: <ul>");
            Arrays.asList(roles).forEach(role -> {
                out.println("              <li>" + role + "</li>");
            });
            out.println("            </ul></li>");
            out.println("        <li>Language: " + language + "</li>");
            out.println("        <li>Enabled: " + enable + "</li>");
            out.println("        <li>Secret: " + secret + "</li>");
            out.println("    </ul>");
            out.println("    </body>");
            out.println("</html>");
        }

    }
}
