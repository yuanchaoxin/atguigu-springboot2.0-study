package com.ityuan.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName com.ityuan.boot.controller.HelloController
 * @Package com.ityuan.boot.controller
 * @Author yuanchaoxin
 * @Date 2021/6/28
 * @Version 1.0
 * @Description
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Hello , Springboot2.0!";
    }
}
