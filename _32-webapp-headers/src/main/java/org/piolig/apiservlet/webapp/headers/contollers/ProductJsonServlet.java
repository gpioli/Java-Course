package org.piolig.apiservlet.webapp.headers.contollers;

import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.piolig.apiservlet.webapp.headers.models.Product;
import org.piolig.apiservlet.webapp.headers.service.ProducService;
import org.piolig.apiservlet.webapp.headers.service.ProductServiceImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/products.json")
public class ProductJsonServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ProducService service = new ProductServiceImpl();
        List<Product> products = service.list();
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(products);
        resp.setContentType("application/json");
        resp.getWriter().write(json);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletInputStream jsonStream = req.getInputStream();
        ObjectMapper objectMapper = new ObjectMapper();
        Product product = objectMapper.readValue(jsonStream, Product.class); // this converts automatically a json to a previously created object

        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("    <head>");
            out.println("        <meta charset=\"UTF-8\">");
            out.println("        <title>Product detail </title>");
            out.println("    </head>");
            out.println("    <body>");
            out.println("        <h1>Product detail</h1>");
            out.println("<ul>");
            out.println("   <li>Id: " + product.getId() + "</li>");
            out.println("   <li>Name: " + product.getName() + "</li>");
            out.println("   <li>Type: " + product.getType() + "</li>");
            out.println("   <li>Price: " + product.getPrice() + "</li>");
            out.println("</ul>");
            out.println("    </body>");
            out.println("</html>");
        }

    }
}
