package com.hu.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author coderHqr
 * @date 2020/1/21 16:23
 */
@SpringBootApplication
@MapperScan(basePackages = "com.hu.oauth2.resource.mapper")
public class Oauth2ResourceApplication {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2ResourceApplication.class, args);
    }
}
