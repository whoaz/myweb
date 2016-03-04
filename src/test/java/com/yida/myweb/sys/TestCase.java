package com.yida.myweb.sys;


import com.yida.myweb.sys.domain.User;
import com.yida.myweb.sys.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by zhouk on 2016/3/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-servlet.xml"})
@PropertySource("classpath:config.properties")
public class TestCase {

    private @Resource UserMapper userMapper;

    @Test
    public void test1() {
        System.out.println("=========================");
        System.out.println("userMapper"+userMapper);
        List<User> user = userMapper.getUser();
        for (User u : user) {
            System.out.println(u.getName());
        }
        System.out.println("=========================");
    }


    @Test
    public void test2() {
        User user = new User();
        user.setId("2");
        user.setName("张三");
        user.setAge(18);
        userMapper.addUser(user);
    }
}


