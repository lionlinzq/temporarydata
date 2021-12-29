package com.demo.springbootyml.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author lin
 * @PACKAGE_NAME
 */

@RestController
public class TestController {

    /**
     * @Description: @RestController == @Controller + @ResponseBody,
     * @Param: []
     * @return: java.lang.String
     * @Author: lin
     */
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
