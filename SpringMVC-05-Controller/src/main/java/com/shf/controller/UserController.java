package com.shf.controller;

import com.shf.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
//        1.接收前端参数
        System.out.println("接收到前端的参数为:"+name);
//        2.将返回的结果传递到前端
        model.addAttribute("msg",name);
//        3.视图跳转
        return "test";
    }

//    前端接收的是一个对象 id name age
    @GetMapping("/t2")
    public String test2(User user,Model model){
        model.addAttribute("msg",user);
        System.out.println(user);
        return "test";
    }

    /**
     * Model  精简版
     * ModelMap  继承了LikedHashMap,所以他拥有了LinkedHashMap的全部功能
     * LinkedHashMap
     *
     */
}
