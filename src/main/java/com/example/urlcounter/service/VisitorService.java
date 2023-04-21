package com.example.urlcounter.service;

import java.util.HashMap;

import org.springframework.stereotype.Service;

@Service
public class VisitorService {


    HashMap<String  ,Integer> hm=new HashMap<>();


    public HashMap<String, Integer> fetchName(String name) {
        hm.put(name,hm.getOrDefault(name, 0)+1);
        return hm;
    }
    
}
