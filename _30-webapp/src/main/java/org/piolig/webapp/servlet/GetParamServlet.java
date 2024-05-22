package org.piolig.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/parameters/url-get")
public class GetParamServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String salute = req.getParameter("salute");
        String name = req.getParameter("name");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("    <head>");
        out.println("        <meta charset=\"UTF-8\">");
        out.println("        <title> Get parameters of the url</title>");
        out.println("    </head>");
        out.println("    <body>");
        out.println("        <h1>Get parameters of the url</h1>");
        if (salute != null && name != null) {
            out.println("        <h2>Sent salute is: " + salute + " " + name + "</h2>");
        } else if (salute != null) {
            out.println("        <h2>Sent salute is: " + salute + "</h2>");
        } else if (name != null) {
            out.println("        <h2>Hello, my name is: " + name + "</h2>");
        }
        else {
            out.println("        <h2>Salute and name parameters were not given</h2>");
        }

        try {
            int code = Integer.parseInt(req.getParameter("code"));
            out.println("<h3>Sent code is: " + code + "</h3>");
        } catch (NumberFormatException e) {
            out.println("<h3>Sent code was not send</h3>");
        }

        out.println("    </body>");
        out.println("</html>");
        out.close();
    }
}
