package com.shf.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.shf.pojo.User;
import com.shf.utils.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

@RestController
public class UserController {

//    ResponseBody 它就不会走视图解析器,会直接返回一个字符串
    @RequestMapping("/j1")
    public String json1() throws JsonProcessingException {
//        jackson mapper
        ObjectMapper mapper = new ObjectMapper();

        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("成都", 33, "女");
        users.add(user1);
        User user2 = new User("成都", 33, "女");
        users.add(user2);
        User user3 = new User("成都", 33, "女");
        users.add(user3);
        User user4 = new User("成都", 33, "女");
        users.add(user4);

        String str = mapper.writeValueAsString(users);
        return str;
    }

    @RequestMapping("/j5")
    public String json5() throws JsonProcessingException {

        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("成都", 33, "女");
        users.add(user1);
        User user2 = new User("成都", 33, "女");
        users.add(user2);
        User user3 = new User("成都", 33, "女");
        users.add(user3);
        User user4 = new User("成都", 33, "女");
        users.add(user4);

        return JsonUtils.getJson(users);
    }

    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

//        不使用时间戳的方式
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
//        自定义日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        objectMapper.setDateFormat(sdf);

//        ObjectMapper,时间戳解析后的默认格式为：Timestamp时间戳
        return objectMapper.writeValueAsString(new Date());
    }

    /**
     *   时间戳
     * @return
     * @throws JsonProcessingException
     */
    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();

        Date date = new Date();

//        自定义日期格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

//        ObjectMapper,时间戳解析后的默认格式为：Timestamp时间戳
        return objectMapper.writeValueAsString(sdf.format(date));
    }


    @RequestMapping("/j4")
    public String json4(){
        Date date = new Date();
        return JsonUtils.getJson(date);
    }


    @RequestMapping("/j6")
    public String json6(){
        ArrayList<User> users = new ArrayList<>();
        User user1 = new User("成都", 33, "女");
        users.add(user1);
        User user2 = new User("成都", 33, "女");
        users.add(user2);
        User user3 = new User("成都", 33, "女");
        users.add(user3);
        User user4 = new User("成都", 33, "女");
        users.add(user4);

        return JSON.toJSONString(users);
    }
}
