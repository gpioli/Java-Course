package org.piolig.apiservlet.webapp.headers.contollers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.piolig.apiservlet.webapp.headers.models.Product;
import org.piolig.apiservlet.webapp.headers.service.ProducService;
import org.piolig.apiservlet.webapp.headers.service.ProductServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Optional;

@WebServlet("/search-product")
public class SearchProductServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ProducService service = new ProductServiceImpl();
        String name = req.getParameter("product");

        Optional<Product> found = service.list().stream().filter(p -> {
            if (name == null || name.isBlank()) {
                return false;
            }
            return p.getName().contains(name);
        }).findFirst();

        if (found.isPresent()) {
            resp.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = resp.getWriter()) {

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("    <head>");
                out.println("        <meta charset=\"UTF-8\">");
                out.println("        <title> Product found! </title>");
                out.println("    </head>");
                out.println("    <body>");
                out.println("        <h1> Product found! </h1>");
                out.println("        <h3> Product found: " + found.get().getName() +
                        " price: $" + found.get().getPrice() + "</h3>");
                out.println("    </body>");
                out.println("</html>");
            }
        } else {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND, "Sorry, product not found");
        }

    }
}
