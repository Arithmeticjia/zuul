package com.arithmeticjia.zuul.dao;

import com.arithmeticjia.zuul.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao {
    Integer toLogin(User user);
}
