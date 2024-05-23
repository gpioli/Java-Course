package org.piolig.webapp.servlet;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@WebServlet("/index.html")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String name = req.getParameter("name");
        String surname = req.getParameter("surname");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("    <head>");
        out.println("        <meta charset=\"UTF-8\">");
        out.println("        <title> Welcome to Webapp </title>");
        out.println("    </head>");
        out.println("    <body>");
        out.println("        <h1> Welcome to Webapp </h1>");

        if (name == null || surname == null) {
            out.println("        <h1> Name and surname parameters are mandatory! </h1>");
        } else {
            out.println("        <h1> Nice to have you back " + name + " " + surname + "!" + "</h1>");
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd 'de' MMMM, yyyy");
        LocalDateTime currentDateTime = LocalDateTime.now();
        String timeString = currentDateTime.format(dtf);
        out.println("        <h1> Actual date is: " + timeString + " </h1>");
        out.println("    </body>");
        out.println("</html>");
        out.close();
    }
}
