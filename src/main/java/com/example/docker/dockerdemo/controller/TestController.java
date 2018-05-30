package com.example.docker.dockerdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luopeng
 * created at 2018/5/30
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/index")
    public String index() {
        return "index, ok!";
    }

}
