package com.example.springbootfoo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jiangwang
 * @date  2018/5/14
 */
@RestController
@RequestMapping(value = "/user")
@Import(ServiceA.class)
public class UserController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private ConnectionSettings connectionSettings;

    @Autowired
    private ServiceA serviceA;

    @GetMapping(value = "/value")
    public  String value(){
        logger.info("中文");
        System.out.println("工作分支-t2测试rebase");
        return "myValue" + connectionSettings.getUsername();
    }

}
