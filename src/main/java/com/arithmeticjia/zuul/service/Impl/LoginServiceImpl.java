package com.arithmeticjia.zuul.service.Impl;
import com.arithmeticjia.zuul.dao.LoginDao;
import com.arithmeticjia.zuul.pojo.User;
import com.arithmeticjia.zuul.service.LoginService;
import com.arithmeticjia.zuul.utils.Pbkdf2Sha256;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("LoginDao")
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao logindao;

    @Override
    public String getPasswordByName(String username){
        return logindao.getPasswordByName(username);
    }
}
