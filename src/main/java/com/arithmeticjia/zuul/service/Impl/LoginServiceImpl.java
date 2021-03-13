package com.arithmeticjia.zuul.service.Impl;
import com.arithmeticjia.zuul.dao.LoginDao;
import com.arithmeticjia.zuul.pojo.User;
import com.arithmeticjia.zuul.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("LoginDao")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao logindao;

    @Override
    public Integer toLogin(String username,String password){
        User loginuser = new User();
        loginuser.setPassword(password);
        loginuser.setUsername(username);
        return logindao.toLogin(loginuser);
    }
}
