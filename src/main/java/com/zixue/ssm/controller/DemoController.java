package com.zixue.ssm.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "测试类")
public class DemoController {

    @RequestMapping("/demo")
//    @ResponseBody
@ApiOperation(value = "demo",notes = "这是一个测试接口",httpMethod = "GET")
    public  String demo(){
        return "this is demo()";
    }
}
