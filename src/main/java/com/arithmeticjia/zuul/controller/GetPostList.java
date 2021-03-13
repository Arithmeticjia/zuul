package com.arithmeticjia.zuul.controller;

import com.arithmeticjia.zuul.api.CommonResult;
import com.arithmeticjia.zuul.pojo.Post;
import com.arithmeticjia.zuul.pojo.PostCategory;
import com.arithmeticjia.zuul.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author ArithmeticJia
 * @version 1.0
 * @date 2021/3/10 2:04 上午
 */
@RestController
@RequestMapping(value = "/api/v1")
public class GetPostList {

    @Autowired
    PostService postService;

//    @UserLoginToken
    @GetMapping("/post/list")
    public CommonResult PostList() {
        try {
            List<PostCategory> postall = postService.getPostAll();
            return CommonResult.success(postall);
        }catch (Exception e) {
            return CommonResult.validateFailed();
        }
    }
}
