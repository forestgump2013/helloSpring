package com.example.demo.controller;

import com.example.demo.entity.Girl;
import com.example.demo.service.RedisKeyPrefix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping(value = "hello")
public class HelloController {
    @Autowired
    private StringRedisTemplate redisTemplate;


    @RequestMapping(value = "say")
    public  String sayHello(){
        return  "Hello boy,Welcome here!";
    }
    @RequestMapping(value = "redis")
    public String findOneGirl(Integer id){
        String key= RedisKeyPrefix.GIRL+id;

        redisTemplate.opsForValue().set(key,"tster");

        return  redisTemplate.opsForValue().get(key);
    }
}
