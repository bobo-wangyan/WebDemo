package com.bobo.controller;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(value = "/demo")
public class DemoServlet extends HttpServlet {


    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        super.service(req, res);
//        Enumeration<String> headerNames = req.getHeaderNames();
//        while (headerNames.hasMoreElements()){
//            String s = headerNames.nextElement();
//
//            String header = req.getHeader(s);
//            System.out.println(s+" "+header);
//            HttpSession session = req.getSession();
//        }
        PrintWriter writer = res.getWriter();
        writer.write("xxxxxx");
       // AsyncContext asyncContext = req.startAsync();



    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        System.out.println("初始化");

    }

    @Override
    public void destroy() {



        System.out.println("destroy");
    }
}
