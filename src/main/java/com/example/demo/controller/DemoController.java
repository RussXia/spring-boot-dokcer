package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiazhengyue
 * @since 2020-01-07
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping(value = "/sayHi", method = RequestMethod.GET)
    public String sayHi(String name) {
        return "Hello," + name;
    }

    @RequestMapping(value = "/sayHello", method = RequestMethod.GET)
    public String sayHello(String name) {
        return "Hello," + name;
    }
}
