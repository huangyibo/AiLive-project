package com.ailiving.iot.servicehub;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@MapperScan("com.ailiving.iot.servicehub.mapper")
public class ServicehubApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicehubApplication.class, args);
    }
}
