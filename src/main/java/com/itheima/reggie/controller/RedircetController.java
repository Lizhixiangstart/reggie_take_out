package com.itheima.reggie.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Author: Lizhixiang
 * @Date: 2023/1/23
 * @Time: 18:33
 * @Description:
 * @Version:
 */
@RestController
public class RedircetController {
    @RequestMapping
    public void redirectToMainPage(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("/backend/page/login/login.html");
    }
}