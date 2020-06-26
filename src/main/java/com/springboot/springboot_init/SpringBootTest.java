package com.springboot.springboot_init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootTest {
    //通过普通属性的注入获取值
    @Value("${name}")
    private String name;
    //使用一个对象调用方法获取值
    @Autowired
    private Environment environment;


    @RequestMapping("/hello")
    public String test(){
        System.out.println(name);
        System.out.println(environment.getProperty("name"));
        return "Hello!!!";
    }
}
