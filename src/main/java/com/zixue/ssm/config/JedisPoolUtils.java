package com.zixue.ssm.config;


import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
public class JedisPoolUtils {

    //	2.定义一个jedisPool变量
    private static JedisPool pool = null;

    //	3.这是配置信息
//	因为这些配置信息和获取jedisPool只需要执行一次 所以使用static代码块
    static{
//		4.通过类加载器获取输入流 路径是相对于src的
        InputStream in = JedisPoolUtils.class.getClassLoader().getResourceAsStream("redis.properties");
//		5.通过properties进行转换
        Properties pro = new Properties();
        try {
            pro.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }

//		6.设置缓存池的配置信息
        JedisPoolConfig config = new JedisPoolConfig();
//		将object类型转成字符串类型 然后在转成int类型
        config.setMaxIdle(Integer.parseInt(pro.get("redis.maxIdle").toString()));
        config.setMaxIdle(Integer.parseInt(pro.get("redis.minIdle").toString()));
        config.setMaxIdle(Integer.parseInt(pro.get("redis.maxTotal").toString()));

//		7.创建缓存池
//        pool = new JedisPool(config, pro.getProperty("redis.ip"), Integer.parseInt(pro.get("redis.port").toString()));
        //public JedisPool(GenericObjectPoolConfig poolConfig, String host, int port, int timeout, String password)
        pool=new JedisPool(config,pro.getProperty("redis.ip"),
                Integer.parseInt(pro.get("redis.port").toString()),
                Integer.parseInt(pro.get("redis.timeout").toString()),
                pro.getProperty("redis.password"));
    }


    //1.获得jedis的方法
    public static Jedis getJedis(){
        return pool.getResource();
    }


}
