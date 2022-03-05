package com.shf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {

    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.POST)
    public String test1(@PathVariable int a,@PathVariable int b, Model model){
        int result = a+b;
        model.addAttribute("msg","结果为:"+result);
        return "test";
    }
}
