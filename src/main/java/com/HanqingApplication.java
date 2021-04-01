package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hanqing.project.mapper")
public class HanqingApplication {

    public static void main(String[] args) {
        SpringApplication.run(HanqingApplication.class, args);
    }

}
