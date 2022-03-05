package com.shf.test;


import com.shf.pojo.Books;
import com.shf.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookserviceImpl = context.getBean("bookServiceImpl", BookServiceImpl.class);
        for (Books books : bookserviceImpl.queryAllBook()) {
            System.out.println(books);
        }

    }
}
