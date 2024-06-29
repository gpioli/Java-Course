package org.piolig.apiservlet.webapp.headers.contollers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/redirect")
public class RedirectServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // Two different ways of redirecting:

        //resp.setHeader("Location", req.getContextPath() + "/products.html");
        //resp.setStatus(HttpServletResponse.SC_FOUND);

        // This does exactly the same
        resp.sendRedirect(req.getContextPath() + "/products.html");


    }
}
