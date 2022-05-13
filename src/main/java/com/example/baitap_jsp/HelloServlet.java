package com.example.baitap_jsp;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/click")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> studentList=new ArrayList<>();
        Student student1=new Student(1,"manh",19);
        Student student2=new Student(2,"tien",23);
        Student student3=new Student(3,"toan",20);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("Result.jsp");
        req.setAttribute("ds",studentList);
        requestDispatcher.forward(req,resp);
    }
    public void destroy() {
    }
}