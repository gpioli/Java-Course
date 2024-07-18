package org.piolig.apiservlet.webapp.headers.contollers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.piolig.apiservlet.webapp.headers.service.LoginService;
import org.piolig.apiservlet.webapp.headers.service.LoginServiceImpl;

import javax.swing.text.html.Option;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Optional;

@WebServlet({"/login", "/login.html"})
public class LoginServlet extends HttpServlet {

    final static String USERNAME = "admin";
    final static String PASSWORD = "12345";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        LoginService auth = new LoginServiceImpl();
        Optional<String> cookieOptional = auth.getUsername(req);

        if (cookieOptional.isPresent()) {
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("    <head>");
                out.println("        <meta charset=\"UTF-8\">");
                out.println("        <title> Hello " + cookieOptional.get() + "</title>");
                out.println("    </head>");
                out.println("    <body>");
                out.println("        <h1>Hello " + cookieOptional.get() + " you've successfully logged in! " + "</h1>");
                out.println("        <p><a href='" + req.getContextPath() + "/index.html'>Return</a></p>");
                out.println("        <p><a href='" + req.getContextPath() + "/logout'>Logout</a></p>");
                out.println("    </body>");
                out.println("</html>");
            }
        } else {
            getServletContext().getRequestDispatcher("/login.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if (USERNAME.equals(username) && PASSWORD.equals(password)) {

            Cookie usernameCookie = new Cookie("username", username);
            resp.addCookie(usernameCookie);

            resp.sendRedirect(req.getContextPath() + "/login.html");

        } else {
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Sorry, not authorized.");
        }
    }

}

