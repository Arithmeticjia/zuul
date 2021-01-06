package com.arithmeticjia.zuul.controller;

import com.alibaba.fastjson.JSONObject;
import com.arithmeticjia.zuul.api.CommonResult;
import com.arithmeticjia.zuul.pojo.User;
import com.arithmeticjia.zuul.service.LoginService;
import com.arithmeticjia.zuul.service.TokenService;
import com.arithmeticjia.zuul.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/api/v1")
public class LoginController {
    @Autowired
    private LoginService loginservice;
    @Autowired
    UserService userService;
    @Autowired
    TokenService tokenService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public CommonResult login(@RequestBody User user) {
        System.out.print(user);
        String username = user.getUsername();
        String password = user.getPassword();
        Integer userlogin = loginservice.toLogin(username, password);
        if(username != null && password != null && userlogin == 1) {
            User userForBase = userService.findByUsername(username);
            String token = tokenService.getToken(userForBase);
            String res = "token=" + token + "&" + "username=" + userForBase.getUsername();
            res = res.replace("=","\":\"");
            res = res.replace("&","\",\"");
            res = "{\"" + res +"\"}";
            JSONObject jsonObject = JSONObject.parseObject(res);
            return CommonResult.success(jsonObject);
        }else {
            return CommonResult.validateFailed();
        }
    }

}
