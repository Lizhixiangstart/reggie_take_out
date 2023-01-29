package com.itheima.reggie;

import com.itheima.reggie.dto.DishDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.List;

/**
 * @Author: Lizhixiang
 * @Date: 2023/1/28
 * @Time: 23:01
 * @Description:
 * @Version:
 */
@SpringBootTest
public class RedisTest {
    @Autowired
    RedisTemplate<String,Object> redisTemplate;
    @Test
    void test1(){

    }
}