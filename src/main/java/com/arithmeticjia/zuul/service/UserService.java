package com.arithmeticjia.zuul.service;

import com.arithmeticjia.zuul.dao.UserDao;
import com.arithmeticjia.zuul.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author arithmeticjia
 * @date 2018-07-08 20:52
 */
@Service("UserService")
public class UserService {
    @Autowired
    UserDao userdao;
    public User findByUsername(String userName){
        return userdao.findUserByUsername(userName);
    }
    public User findUserById(int userId) {
        return userdao.findUserById(userId);
    }

}