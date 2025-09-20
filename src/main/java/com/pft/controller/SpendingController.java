package com.pft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pft.model.Spending;
import com.pft.service.SpendingService;

@RestController
public class SpendingController {

    @Autowired
    private SpendingService service;

    @GetMapping
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/findById/{id}")
    public Spending findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @GetMapping("/findByCategory")
    public List<Spending> findByCategory(@RequestParam(required = true) String category) {
        return service.findByCategory(category);
    }
}