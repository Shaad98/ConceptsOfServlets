package com.example;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class Example3 extends HttpServlet{
    public void doGet(HttpServletRequest request , HttpServletResponse response)throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("username");
        out.println("<html><head><title>HttpServlet Response</title></head>");
        out.println("<body> <h1>Welcome Dear "+name+"To Our Web Application </h1> </body></html>");
    }
}
