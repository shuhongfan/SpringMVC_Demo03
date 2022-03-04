package com.shf.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView = new ModelAndView();

//        业务员代码
        String result = "HelloSpringMVC";

        modelAndView.addObject("msg",result);
        modelAndView.setViewName("hello");

//        视图跳转
        modelAndView.setViewName("hello");

        return modelAndView;
    }
}
