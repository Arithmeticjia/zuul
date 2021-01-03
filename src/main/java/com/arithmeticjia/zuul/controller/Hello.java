package com.arithmeticjia.zuul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ArithmeticJia
 * @version 1.0
 * @date 2021/1/3 8:22 下午
 */
@RestController
public class Hello {

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name){
        return "hello " + name;
    }
}