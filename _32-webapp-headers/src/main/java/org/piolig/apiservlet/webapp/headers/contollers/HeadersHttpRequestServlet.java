package org.piolig.apiservlet.webapp.headers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/headers-request")
public class HeadersHttpRequestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String httpMethod = req.getMethod(); // method used in the request (although we know we are in a GET)
        String requestUri = req.getRequestURI();
        String requestUrl = req.getRequestURL().toString();
        String contextPath = req.getContextPath(); // project name
        String servletPath = req.getServletPath();
        String clientIp = req.getRemoteAddr();
        String ip = req.getLocalAddr();
        int port = req.getLocalPort();
        String scheme = req.getScheme();
        String host = req.getHeader("host");
        String url = scheme + "://" + host + contextPath + servletPath;
        String url2 = scheme + "://" + ip + ":" + port + contextPath + servletPath;

        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("    <head>");
            out.println("        <meta charset=\"UTF-8\">");
            out.println("        <title> HTTP Headers Request </title>");
            out.println("    </head>");
            out.println("    <body>");
            out.println("        <h1>HTTP Headers Request</h1>");
            out.println("<ul>");
            out.println("<li> HTTP method: " + httpMethod + "</li>");
            out.println("<li> Request URI: " + requestUri + "</li>");
            out.println("<li> Request URL: " + requestUrl + "</li>");
            out.println("<li> Contex path / project name: " + contextPath + "</li>");
            out.println("<li> Servlet path: " + servletPath + "</li>");
            out.println("<li> Local IP: " + ip + "</li>");
            out.println("<li> Client IP: " + clientIp + "</li>");
            out.println("<li> Local Port: " + port + "</li>");
            out.println("<li> Schema: " + scheme + "</li>");
            out.println("<li> Host: " + host + "</li>");
            out.println("<li> URL: " + url + "</li>");
            out.println("<li> URL2: " + url2 + "</li>");

            Enumeration<String> headerNames = req.getHeaderNames();
            while (headerNames.hasMoreElements()) {
                String cabecera = headerNames.nextElement();
                out.println("<li>" + cabecera + ":" + req.getHeader(cabecera) + "</li>");
            }

            out.println("</ul>");
            out.println("    </body>");
            out.println("</html>");
        }

    }
}
