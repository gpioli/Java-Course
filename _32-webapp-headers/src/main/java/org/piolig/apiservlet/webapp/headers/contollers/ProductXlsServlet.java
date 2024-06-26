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
import java.util.List;

@WebServlet({"/products.xls", "/products.html", "/products"})
public class ProductXlsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProducService service = new ProductServiceImpl();
        List<Product> products = service.list();

        resp.setContentType("text/html;charset=UTF-8");
        String servletPath = req.getServletPath();
        boolean isXls = servletPath.endsWith(".xls");

        if (isXls) {
            resp.setContentType("application/vnd.ms-excel"); // this allows us to export the content to an excel file
            resp.setHeader("Content-Disposition", "attachment;filename=products.xls"); // forces download and allows setting a filename
        }

        try (PrintWriter out = resp.getWriter()) {

            if (!isXls) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("    <head>");
                out.println("        <meta charset=\"UTF-8\">");
                out.println("        <title> Products list </title>");
                out.println("    </head>");
                out.println("    <body>");
                out.println("    <body>");
                out.println("<p><a href=\"" + req.getContextPath() + "/products.xls" + "\"> export to xls </a> </p>");
                out.println("        <h1>Products list! </h1>");
            }

            out.println("        <table>");
            out.println("        <tr>");
            out.println("        <th>id</th>");
            out.println("        <th>name</th>");
            out.println("        <th>type</th>");
            out.println("        <th>price</th>");
            out.println("        </tr>");
            products.forEach(p -> {
                out.println("<tr>");
                out.println("<td>" + p.getId() + "</td>");
                out.println("<td>" + p.getName() + "</td>");
                out.println("<td>" + p.getType() + "</td>");
                out.println("<td>" + p.getPrice() + "</td>");
                out.println("</tr>");
            });
            out.println("        </table>");

            if (!isXls) {
                out.println("    </body>");
                out.println("</html>");
            }
        }

    }
}
