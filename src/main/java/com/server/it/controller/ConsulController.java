package com.server.it.controller;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/consul")
public class ConsulController {

    @GetMapping("/hello")
    public Object hellworld (HttpServletRequest request, HttpServletResponse response, @RequestParam("name") String name) {
        return "你好！" + name + ",这是第1个微服务。";
    }

}
