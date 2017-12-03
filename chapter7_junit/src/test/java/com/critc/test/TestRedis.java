package com.critc.test;

import com.critc.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by 孔垂云 on 2017/12/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void testReids() {
        redisUtil.set("redis_util", "test", 30);
        System.out.println("获取值：" + redisUtil.get("redis_util", String.class));
    }
}
