package com.arithmeticjia.zuul.service;

import com.arithmeticjia.zuul.dao.PostDao;
import com.arithmeticjia.zuul.pojo.PostCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ArithmeticJia
 * @version 1.0
 * @date 2021/3/10 2:07 上午
 */
@Service
public class PostService {
    @Autowired
    PostDao postDao;
    public List<PostCategory> getPostAll(){return postDao.getPostAll();};
}
