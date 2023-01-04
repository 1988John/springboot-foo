package com.example.springbootfoo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

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
        System.out.println("mywork--1");
        System.out.println("mywork--主分支上");
        return "myValue" + connectionSettings.getUsername();
    }

    public static void main(String[] args) {
        float v = 0.1f;
        System.out.println("mywork--主分支上1111111");
        cal(String.valueOf(v));
    }

    private static void cal(String f) {
        BigDecimal bd = new BigDecimal(f);
        System.out.println("mywork--主分支上1111111");
        BigDecimal bigDecimal = new BigDecimal("0.1");
        System.out.println(bd.compareTo(bigDecimal));
    }


}
