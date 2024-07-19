package org.piolig.apiservlet.webapp.headers.contollers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.piolig.apiservlet.webapp.headers.models.Product;
import org.piolig.apiservlet.webapp.headers.service.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Optional;

@WebServlet({"/products.html", "/products"})
public class ProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductService service = new ProductServiceImpl();
        List<Product> products = service.list();

        LoginService auth = new LoginServiceSessionImpl();
        Optional<String> usernameOptional = auth.getUsername(req);

        resp.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = resp.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("    <head>");
            out.println("        <meta charset=\"UTF-8\">");
            out.println("        <title> Products list </title>");
            out.println("    </head>");
            out.println("    <body>");
            out.println("    <body>");
            out.println("        <h1>Products list! </h1>");
            if (usernameOptional.isPresent()) {
                out.println("<div style='color:blue'>Hello " + usernameOptional.get() + ". Welcome!" + "</div>");
            }

            out.println("        <table>");
            out.println("        <tr>");
            out.println("        <th>id</th>");
            out.println("        <th>name</th>");
            out.println("        <th>type</th>");
            if (usernameOptional.isPresent()) {
                out.println("        <th>price</th>");
                out.println("        <th>add</th>");
            }
            out.println("        </tr>");
            products.forEach(p -> {
                out.println("<tr>");
                out.println("<td>" + p.getId() + "</td>");
                out.println("<td>" + p.getName() + "</td>");
                out.println("<td>" + p.getType() + "</td>");
                if (usernameOptional.isPresent()) {
                    out.println("<td>" + p.getPrice() + "</td>");
                    out.println("<td><a href=\"" + req.getContextPath()
                            + "/add-cart?id=" + p.getId() + "\">add-to-cart</a></td>");
                }

                out.println("</tr>");
            });
            out.println("        </table>");

            out.println("    </body>");
            out.println("</html>");
        }

    }
}
