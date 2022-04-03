package com.amq.openshift.client.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class Controller {

    @RequestMapping(path = "/msg/{message}", method = RequestMethod.GET)
    public String testAmqOnOcp(@PathVariable("message") String msg) {
        System.out.println(msg);
        return "Hello " + msg;
    }

    @RequestMapping("/test")
    public String testApp() {
        return "Hello, Application is running";
    }
}
