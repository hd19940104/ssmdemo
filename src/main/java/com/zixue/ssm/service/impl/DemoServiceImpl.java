package com.zixue.ssm.service.impl;

import com.zixue.ssm.config.JedisPoolUtils;
import com.zixue.ssm.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {



    public void setRedis(String key,String value) {
        JedisPoolUtils.getJedis().set(key,value);
    }

    public String getRedis(String key) {
        return JedisPoolUtils.getJedis().get(key);
    }
}
