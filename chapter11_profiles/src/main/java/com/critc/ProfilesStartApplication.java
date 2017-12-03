package com.critc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 启动类
 */
@SpringBootApplication
@EnableScheduling
public class ProfilesStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProfilesStartApplication.class, args);
    }
}
