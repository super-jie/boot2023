package com.atguigu.boot.config;

import com.atguigu.boot.entities.Car;
import com.atguigu.boot.entities.Pet;
import com.atguigu.boot.entities.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(Car.class)
public class Myconfig {

    @Bean
    public Pet pet01(){
        return new Pet("xiaogou",3);
    }

    @Bean
    @ConditionalOnBean(name = "pet01")
    public User user01(){
        return new User("zhangsan",18);
    }


}
