package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiazhengyue
 * @since 2020-01-16
 */
@Slf4j
@RestController
@RequestMapping("/cache")
public class CacheController {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getValue(String key) {
        String value = stringRedisTemplate.opsForValue().get(key);
        log.info("get cache from redis,key :{} , value : {}", key, value);
        return value;
    }

    @RequestMapping(value = "/set", method = RequestMethod.GET)
    public String setValue(String key, String value) {
        stringRedisTemplate.opsForValue().set(key, value);
        log.info("set cache to redis,key :{} , value : {}", key, value);
        return value;
    }
}
