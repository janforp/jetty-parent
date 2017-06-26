package com.janita.boot.jetty.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Janita on 2017/6/26 0026-下午 12:41
 * 该类是：
 */
@RestController
public class JettyController {

    @GetMapping("/test")
    public String test() {
        return "hello jetty";
    }
}
