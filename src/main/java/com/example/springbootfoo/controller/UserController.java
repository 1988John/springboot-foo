package com.example.springbootfoo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangwang
 * @date  2018/5/14
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping(value = "/value")
    public  String value(){
        logger.info("中文");
        return "myValue";
    }

}
