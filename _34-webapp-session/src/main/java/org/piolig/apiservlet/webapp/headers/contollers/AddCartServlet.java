package org.piolig.apiservlet.webapp.headers.contollers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.piolig.apiservlet.webapp.headers.models.Cart;
import org.piolig.apiservlet.webapp.headers.models.CartItem;
import org.piolig.apiservlet.webapp.headers.models.Product;
import org.piolig.apiservlet.webapp.headers.service.ProductService;
import org.piolig.apiservlet.webapp.headers.service.ProductServiceImpl;

import java.io.IOException;
import java.util.Optional;

@WebServlet("/add-cart")
public class AddCartServlet  extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Long id = Long.parseLong(req.getParameter("id"));
        ProductService service = new ProductServiceImpl();
        Optional<Product> product = service.findById(id);
        if (product.isPresent()) {
            CartItem item = new CartItem(1, product.get());
            HttpSession session = req.getSession();
            Cart cart;
            if (session.getAttribute("cart") == null) {
                cart = new Cart();
                session.setAttribute("cart", cart);
            } else {
                cart = (Cart) session.getAttribute("cart");
            }
            cart.addItem(item);
        }
        resp.sendRedirect(req.getContextPath() + "/see-cart");
    }
}
