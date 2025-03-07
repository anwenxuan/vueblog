package com.anwenxuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.anwenxuan.mapper")
@SpringBootApplication
public class VueblogApplication {
    public static void main (String[] args) {
        SpringApplication.run(VueblogApplication.class, args);
    }

}
