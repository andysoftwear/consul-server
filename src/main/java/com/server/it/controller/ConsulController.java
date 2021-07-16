package com.server.it.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/consul")
public class ConsulController {

    @PostMapping("/hello")
    public Object hellworld (HttpServletRequest request, HttpServletResponse response, @RequestParam("name") String name) {
        return "你好！" + name + ",这是第1个微服务。";
    }

}
