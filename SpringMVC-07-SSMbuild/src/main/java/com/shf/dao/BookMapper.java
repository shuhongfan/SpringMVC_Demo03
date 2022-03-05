package com.shf.dao;

import com.shf.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface BookMapper {
//    添加一本书
    int addBook(Books books);

//    删除一本书
    int deleteBookById(@Param("bookId") int id);

//    更新一本书
    int updateBook(Books books);

//    查询一本书书
    Books queryBookById(@Param("bookId") int id);

//    查询全部的书
    List<Books> queryAllBook();

    Books queryBookByName (@Param("bookName") String bookName);
}
