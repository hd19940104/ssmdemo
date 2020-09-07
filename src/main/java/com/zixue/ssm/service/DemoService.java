package com.zixue.ssm.service;

public interface DemoService {
    /**
     * 设置redis 值
     * @param value
     */
    public  void setRedis(String key,String value);

    /**
     * 从redis 获取相应值
     * @param key
     * @return
     */
    public  String getRedis(String key);
}
