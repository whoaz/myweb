package com.yida.myweb.sys.mapper;

import com.yida.myweb.common.annotation.MybatisRepository;
import com.yida.myweb.sys.domain.User;

import java.util.List;

/**
 * Created by zhouk on 2016/3/4.
 */
@MybatisRepository
public interface UserMapper {
    List<User> getUser() ;

    void addUser(User user);
}
