package com.imooc.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author bo li
 * @date 2020-12-14 12:18
 */
// 因为还要扫描 imooc-news-dev-service-api 中的配置，所以要把扫描范围扩大
@ComponentScan(basePackages = "com.imooc")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
