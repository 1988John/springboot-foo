package com.example.springbootfoo.controller;

import java.util.ArrayList;
import java.util.List;

public class ServiceA {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.addAll(null);
        System.out.println(list);
    }
}
