package com.critc;

import com.critc.model.UserConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({UserConfig.class})
public class ConfigStartApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigStartApplication.class, args);
    }
}
