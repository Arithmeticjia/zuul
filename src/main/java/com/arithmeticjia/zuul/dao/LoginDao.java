package com.arithmeticjia.zuul.dao;

import com.arithmeticjia.zuul.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Mapper
@Repository
public interface LoginDao {
    String getPasswordByName(@Param("username") String username);
}
