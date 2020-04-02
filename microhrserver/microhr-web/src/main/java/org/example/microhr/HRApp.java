package org.example.microhr;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableCaching
@MapperScan(basePackages = {"org.example.microhr.mapper"})
public class HRApp {
    public static void main(String[] args) {
        SpringApplication.run(HRApp.class, args);
    }
}
