package com.arithmeticjia.zuul.dao;

import com.arithmeticjia.zuul.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author arithmeticjia
 * @date 2020-03-19 20:44
 */
@Mapper
@Repository
public interface UserDao {
    User findUserByUsername(@Param("Username") String username);
    User findUserById(@Param("Id") int id);
}
