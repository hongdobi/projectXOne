package com.pxone.market.springboot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("welcome")
    public String hello() {
        return "welcome!";
    }
}
