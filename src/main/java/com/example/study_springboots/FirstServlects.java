package com.example.study_springboots;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/firstServlets")
// client가 firstServlets를 요청하면 urlPatterns받아서 작동시작.
public class FirstServlects extends HttpServlet {
    // method를 만드는데 return type이 없는 형태로 만들고 그 method이름은 doGet이다
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("SUCCESS!!");
    }

}
