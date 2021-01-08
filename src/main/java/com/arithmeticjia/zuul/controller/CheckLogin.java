package com.arithmeticjia.zuul.controller;

import com.arithmeticjia.zuul.annotation.UserLoginToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping(value = "/api/v1")
public class CheckLogin {

    @UserLoginToken
    @GetMapping("/check-login")
    public String checkLogin() {
        return "HelloWord";
    }
}

