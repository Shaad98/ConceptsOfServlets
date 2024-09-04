package com.example;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class Example2 extends GenericServlet{
    public void service(ServletRequest req , ServletResponse res) throws ServletException,IOException
    {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        String name = req.getParameter("username");
        out.println("<html><head><title>Generic Servlet Response</title></head>");
        out.println("<body><h1>Welcome To Our Web Application "+name+"</h1>");
    }
}
