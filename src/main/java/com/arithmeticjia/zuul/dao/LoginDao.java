package com.arithmeticjia.zuul.dao;

import com.arithmeticjia.zuul.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Mapper
@Repository
public interface LoginDao {
    Integer toLogin(User user);
}
