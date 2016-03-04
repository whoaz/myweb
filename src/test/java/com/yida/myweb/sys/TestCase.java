package com.yida.myweb.sys;

import com.alibaba.druid.pool.DruidDataSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by zhouk on 2016/3/4.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:spring-servlet.xml"})
@PropertySource("classpath:config.properties")
public class TestCase {

    private @Resource DruidDataSource dataSource;

    @Test
    public void test1() {
        System.out.println("=========================");
        System.out.println("dataSource"+dataSource);
        System.out.println("=========================");
    }

}
