package com.itheima;

import com.itheima.web.scheduletask.ScheduleTask;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class BlogSystemApplication {
    public static void main(String[] args) {

        SpringApplication.run(BlogSystemApplication.class,args);

    }
}