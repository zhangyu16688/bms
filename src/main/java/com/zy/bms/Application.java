package com.zy.bms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement // 启注解事务管理
@SpringBootApplication
@ComponentScan("com.zy.bms")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
