package com.demo.springbootssmp.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.demo.springbootssmp.entity.Book;

import java.util.List;

public interface BookService {
    Boolean save(Book book);
    Boolean update(Book book);
    Boolean delete(Integer id);
    Book getById(Integer id);
    List<Book> getAll();

//    分页接口
    IPage<Book> getPage(int currentPage,int pageSize);
}
