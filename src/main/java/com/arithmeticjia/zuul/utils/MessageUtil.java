package com.arithmeticjia.zuul.utils;

import com.arithmeticjia.zuul.message.Message;

import java.util.Date;

public class MessageUtil {

    /**
     * 成功并返回数据实体类
     * @param o
     * @param <E>
     * @return
     */
    public static <E> Message<E> ok(E o){
        return new Message<>(200, "success", o, new Date().getTime());
    }

    /**
     * 成功，但无数据实体类返回
     * @return
     */
    public static <E>Message<E> ok(){
        return new Message<>(200, "success", null, new Date().getTime());
    }

    /**
     * 失败，有自定义异常返回
     * @param code
     * @param msg
     * @return
     */
    public static <E>Message<E> error(Integer code,String msg){
        return new Message<>(code, msg, null, System.currentTimeMillis());
    }
}