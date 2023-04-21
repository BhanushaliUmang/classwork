package com.example.urlcounter.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.urlcounter.service.VisitorService;

@RestController
public class VisitorController {
    
    @Autowired
    VisitorService service;

    @GetMapping(value = "/name/{name}/count")
    public HashMap<String, Integer> count(@PathVariable String name) {
		return service.fetchName(name);
	}
}
