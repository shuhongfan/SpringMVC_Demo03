package com.shf.controller;

import com.shf.pojo.Books;
import com.shf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
//    controller调用service层
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

//    查询全部的数据,并且返回到一个书籍展示页面
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("list",books);
        return "allBook";
    }

//    跳转到增加书籍页面
    @RequestMapping("/toAddPage")
    public String toAddPage(){
        return "addBook";
    }

//    添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addbook===>"+books);
        bookService.addBook(books);
//        重定向到allBook
        return "redirect:/book/allBook";
    }

//    跳转到修改页面
    @RequestMapping("/toUpdate")
    public String toUpdatePaper(int id,Model model){
        Books book = bookService.queryBookById(id);
        model.addAttribute("Qbook",book);
        return "updateBook";
    }

//    修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updateBook====>"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

//    删除书籍
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

//    查询书籍
    @RequestMapping("/queryBookByName")
    public String queryBookByName(String bookName,Model model){
        Books books = bookService.queryBookByName(bookName);
        System.out.println("queryBookByName===>"+books);

        List<Books> list = new ArrayList<>();
        list.add(books);

        if (books==null){
            list = bookService.queryAllBook();
            model.addAttribute("error","未查到");
        }
        model.addAttribute("list",list);

        return "allBook";
    }

}
