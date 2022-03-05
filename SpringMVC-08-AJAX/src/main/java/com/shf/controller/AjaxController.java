package com.shf.controller;

import com.shf.pojo.User;
import com.sun.deploy.net.HttpResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class AjaxController {
    @RequestMapping("/t1")
    public String test(){
        return "hello";
    }

    @RequestMapping("/a1")
    public void a1(String name, HttpServletResponse response) throws IOException {
        System.out.println("a1:param=>"+name);
        if ("shf".equalsIgnoreCase(name)){
            response.getWriter().print("true");
        } else {
            response.getWriter().print("false");
        }
    }

    @RequestMapping("/a2")
    public List<User> a2(){
        List<User> users = new ArrayList<User>();

//        添加数据
        users.add(new User("dfs前端",1,"男"));
        users.add(new User("dfs后端",12,"女"));
        users.add(new User("dfs",4,"男"));

        return users;
    }

    @RequestMapping("/a3")
    public String a3(String name,String pwd){
        String msg="";
        if (name!=null){
            if ("admin".equalsIgnoreCase(name)){
                msg="OK";
            } else {
                msg="用户名有误";
            }
        }

        if (pwd!=null){
            if ("123456".equalsIgnoreCase(pwd)){
                msg="OK";
            } else {
                msg="密码有误";
            }
        }
        return msg;
    }
}
