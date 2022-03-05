package com.shf.config;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
//        放行
        HttpSession session = request.getSession();
        if (session.getAttribute("userLoginInfo")!=null){
            return true;
        }
//        登录页面放行
        if(request.getRequestURI().contains("goLogin")){
            return true;
        }
        //        提交登录放行
        if(request.getRequestURI().contains("login")){
            return true;
        }

//        未登录 跳转到登录界面
        request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);
        return false;
    }
}
