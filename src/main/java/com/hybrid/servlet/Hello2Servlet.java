package com.hybrid.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Hello2")
public class Hello2Servlet extends HttpServlet {
  
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("#######################");
      System.out.println("HelloServlet.doGet()...");
      System.out.println("#######################");
      
      response.setContentType("text/html; charset: utf-8");
      PrintWriter out = response.getWriter();
      out.println("<!doctype html>");
      out.println("<html>");
      out.println("<head>");
      out.println("<title>HelloServlet</title>");
      out.println("</head>");
      out.println("<body>");
      out.println("<button><a href='http://localhost:8080/Hello.html'>Hello.html</button><br>");
      out.println("<button><a href='http://localhost:8080/Hello.jsp'>Hello.jsp</button><br>");
      out.println("<button><a href='http://localhost:8080/deptList.jsp'>deptList.jsp</button><br>");
      out.println("<button><a href='http://localhost:8080/directive.jsp'>directive.jsp</button><br>");
      out.println("<button><a href='http://localhost:8080/Hello'>Hello.servlet</button><br>");
      out.println("</body>");
      out.println("</html>");
   }
}