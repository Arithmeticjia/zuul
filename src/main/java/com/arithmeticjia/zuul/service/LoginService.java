package com.arithmeticjia.zuul.service;

import org.springframework.stereotype.Service;

@Service("LoginService")
public interface LoginService {
    Integer toLogin(String username,String password);
}
