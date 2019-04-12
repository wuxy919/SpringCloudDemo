package com.wuxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author: wuxy
 * @create: 2019-04-11 19:50
 **/
@SpringBootApplication
@EnableFeignClients
public class FeignApplcaition {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplcaition.class, args);
    }
}
