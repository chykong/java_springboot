package com.critc.controller;

import com.critc.model.UserConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 孔垂云 on 2017/12/3.
 */
@RestController
public class ConfigController {
    @Value("${userConfig.age}")
    private String age;


    @RequestMapping("/config")
    public String config() {
        return "age:" + age;
    }
    @Autowired
    private UserConfig userConfig;
    @RequestMapping("/user")
    public String user() {
        return "name:" + userConfig.getName()+"<br/>age:"+userConfig.getAge();
    }
}
