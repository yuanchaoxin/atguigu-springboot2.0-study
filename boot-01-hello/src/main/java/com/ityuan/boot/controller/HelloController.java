package com.ityuan.boot.controller;

import com.ityuan.boot.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello , Springboot2.0!";
    }

    @RequestMapping("/person")
    public Person getPerson() {
        return person;
    }
}
