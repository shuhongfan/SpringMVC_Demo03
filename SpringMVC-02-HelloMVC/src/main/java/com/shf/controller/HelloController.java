package com.shf.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.annotation.Annotation;

public class HelloController implements Controller {

    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        modelAndView  模型和视图
        ModelAndView modelAndView = new ModelAndView();

//        封装对象,放在ModelAndView中
        modelAndView.addObject("msg","HelloSpringMVC!");

//        封装要跳转的视图,放在modelAndView中
        modelAndView.setViewName("hello");  // /WEB-INF/jsp/hello.jsp
        return modelAndView;
    }
}
