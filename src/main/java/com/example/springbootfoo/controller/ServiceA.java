package com.example.springbootfoo.controller;

import java.util.ArrayList;
import java.util.List;

public class ServiceA {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.addAll(null);
        System.out.println(list);
        System.out.println("这里是建了workf分支后加入的内容----");
        System.out.println("main - mywork -1 -- 2");
    }
}
