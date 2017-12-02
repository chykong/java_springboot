package com.critc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 孔垂云 on 2017/12/2.
 */
@RestController
public class FirstController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello SpringBoot";
    }
}
