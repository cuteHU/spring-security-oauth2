package com.hu.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author coderHqr
 * @date 2020/1/21 10:50
 */
@SpringBootApplication
@MapperScan(basePackages = "com.hu.oauth2.server.mapper")
public class Oauth2ServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(Oauth2ServerApplication.class, args);
    }
}
