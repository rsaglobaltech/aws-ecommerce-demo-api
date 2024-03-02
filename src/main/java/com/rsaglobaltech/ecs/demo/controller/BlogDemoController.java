package com.rsaglobaltech.ecs.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/newendpoint")
public class BlogDemoController {

    @RequestMapping(method = RequestMethod.GET)
    public String newendpoint() {
        return "Demo Worked";
    }
}
