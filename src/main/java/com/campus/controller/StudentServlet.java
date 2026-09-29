package com.campus.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;    
import java.io.IOException;
import java.io.PrintWriter;

import com.campus.service.StudentService;

@WebServlet("/student")
public class StudentServlet extends HttpServlet{
    private final StudentService studentService = new StudentService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
     throws IOException { 
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><tittle>List of Students</tittle></head>");
        out.println("<body>");

        out.println("<h1>All Students</h1>");
        out.println("<ul>");
        for (String student : studentService.getStudents()) {
            out.println("<li>" + student + "</li>");
        }
        out.println("</ul>");
        out.println("<a href=\"/student.html\">AddStudent</a>");
        out.println("</body>");
        out.println("</html>");


