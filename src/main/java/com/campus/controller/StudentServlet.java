package com.campus.controller;

import jakart.servlet.RequestDispatcher;
import jakart.servlet.ServletException;
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
    protected void doGet(HttpServletRequest request, HttpServletResponse resonse)
     throws IOException { 
        


