package com.arithmeticjia.zuul.dao;

import com.arithmeticjia.zuul.pojo.PostCategory;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ArithmeticJia
 * @version 1.0
 * @date 2021/3/10 2:08 上午
 */
@Mapper
@Repository
public interface PostDao {
    List<PostCategory> getPostAll();
}
