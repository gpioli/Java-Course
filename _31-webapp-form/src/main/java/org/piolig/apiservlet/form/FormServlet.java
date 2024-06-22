package org.piolig.apiservlet.form;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@WebServlet("/registry")
public class FormServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String email = req.getParameter("email");
        String country = req.getParameter("country");
        String[] programmingLanguages = req.getParameterValues("programmingLanguages");
        String[] roles = req.getParameterValues("role");

        String language = req.getParameter("language");
        boolean enable = req.getParameter("enable") != null &&
                req.getParameter("enable").equals("on");
        String secret = req.getParameter("secret");

        // Error validation
        Map<String, String> errors = new HashMap<>();

        if (username == null || username.isBlank()) {
            errors.put("username", "Username required!");
        }

        if (password == null || password.isBlank()) {
            errors.put("password", "Password cannot be empty");
        }

        if (email == null || !email.contains("@")) {
            errors.put("email", "Email is required and must have a valid email format");
        }

        if (country == null || country.equals("") || country.equals(" ")) {
            errors.put("country", "Country required");
        }

        if (programmingLanguages == null || programmingLanguages.length == 0) {
            errors.put("programmingLanguages", "At least one programming language is required");
        }

        if (roles == null || roles.length == 0) {
            errors.put("roles", "At least one role is required");
        }

        if (language == null) {
            errors.put("language", "Language required");
        }


        resp.setContentType("text/html");
        if (errors.isEmpty()) {

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

        } else {
//                errors.forEach(error -> {
//                    out.println("<li>" + error + "</li>");
//                });
//                out.println("<p><a href=\"/webapp-form/index.jsp\">Return</a>");

            // here we send the error list to the view in order to work with them
            req.setAttribute("errors", errors);
            req.getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
        }


    }
}
