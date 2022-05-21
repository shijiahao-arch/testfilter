package com.evalshell.Servlet;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req,resp);
        resp.getWriter().write("hello");
//        System.out.println("hello");
    }
//private static final long serialVersionUID = 1L;
//    private String message;
//
//    //初始化方法
//    public void init() throws ServletException{
//        message = "Hello World";
//    }
//
//    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
//
//        //设置响应内容类型
//        response.setContentType("text/html");
//
//        //具体的逻辑
//        PrintWriter out = response.getWriter();
//        out.println("<h1>" + message + "</h1>");
//    }
//
//    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        doGet(request, response);
//    }
//
//    public void destory(){
//
//    }

}
