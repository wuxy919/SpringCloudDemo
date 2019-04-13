package com.wuxy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wuxy
 * @create: 2019-04-13 08:47
 **/
@RestController
@RequestMapping("/zipkin")
public class ZipKinController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index() {
        return this.port;
    }
}
