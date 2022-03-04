package com.shf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/h1")
    public String hello(Model model){
//        封装数据
        model.addAttribute("msg","Hello,SpringMVCAnnotation");
        return "hello";
    }
}
