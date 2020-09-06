package com.zixue.ssm.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class DemoController {

    @RequestMapping("/demo")
//    @ResponseBody

    public  String demo(){
        return "this is demo()";
    }
}
