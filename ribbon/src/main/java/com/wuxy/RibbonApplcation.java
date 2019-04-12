package com.wuxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author: wuxy
 * @create: 2019-04-11 18:14
 **/
@SpringBootApplication
public class RibbonApplcation {
    public static void main(String[] args) {
        SpringApplication.run(RibbonApplcation.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
