package com.example.domestic301.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/domestic301")
public class testController {

    @RequestMapping("/test")
    public String testController(@RequestParam(value = "data") String data){

        return data;
    }

}
