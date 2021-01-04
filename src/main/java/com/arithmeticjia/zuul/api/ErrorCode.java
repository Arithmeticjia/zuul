package com.arithmeticjia.zuul.api;

/**
 * 封装API的错误码
 * Created by macro on 2019/4/19.
 */
public interface ErrorCode {
    long getCode();
    String getMessage();
}