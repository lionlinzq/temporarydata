package com.demo.springbootssmp.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.demo.springbootssmp.entity.Book;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookDao extends BaseMapper<Book> {


}
