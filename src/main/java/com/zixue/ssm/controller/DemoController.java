package com.zixue.ssm.controller;


import com.Test1;
import com.alibaba.fastjson.JSONObject;
import com.zixue.ssm.config.JedisPoolUtils;
import com.zixue.ssm.service.DemoService;
import com.zixue.ssm.test.Demo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Api(value = "测试类")
public class DemoController {
    @Autowired()
Test1 test1;
    @Autowired
    DemoService demoService;

    @RequestMapping("/demo")
    @ApiOperation(value = "demo",notes = "这是一个测试接口",httpMethod = "GET")
    public  String demo(){

        return "this is demo()";
    }


    @RequestMapping("/setRedis")
    @ApiOperation(value = "设置redis值",notes = "示例：{\"key\":\"k2\",\"value\":\"1\"}",httpMethod = "POST")
    public  String setRedis(@RequestBody JSONObject jsonObject){

        Object o;
        JedisPoolUtils.getJedis().set(jsonObject.getString("key"),jsonObject.getString("value"));
        return "this is demo()";
    }


    @RequestMapping("/getRedis")
    @ApiOperation(value = "获取redis值",notes = "示例：{\"key\":\"k\"}",httpMethod = "POST")
    public  String getRedis(@RequestBody  JSONObject jsonObject){

        return JedisPoolUtils.getJedis().get(jsonObject.getString("key"));
    }

}
