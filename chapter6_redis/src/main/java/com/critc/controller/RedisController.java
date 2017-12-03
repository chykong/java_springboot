package com.critc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * Created by 孔垂云 on 2017/12/3.
 */
@RestController
public class RedisController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/set")
    public void set() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        ops.set("test_redis", "hello redis", 1, TimeUnit.MINUTES);//1分钟过期
    }

    @RequestMapping("/get")
    public String get() {
        ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
        return ops.get("test_redis");
    }
}
