package com.example;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;
public class Example1 implements Servlet{
    ServletConfig config;
    public  void init(ServletConfig config)
    {
        this.config = config;
        System.out.println("Creating Servlets Object!");
    }
    public void service(ServletRequest req,ServletResponse resp) throws ServletException,IOException
    {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String name = req.getParameter("username");
        out.println("<html> <head> <title> Servlet Response </title> </head>");
        out.println("<body> <h1>Hello "+name+" Welcome To Our Web Application!</h1></body></html>");
    }
    public void destroy()
    {
        System.out.println("Going to destroy servlet object");
    }
    public ServletConfig getServletConfig()
    {
        return this.config;
    }
    public String getServletInfo()
    {
        return "This servlet created by Shaad Bangi ! ";
    }
}
