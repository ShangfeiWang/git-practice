package com.wsf.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
        System.out.println("pre分支代码");
        System.out.println("gray分支代码");
        System.out.println("gray1分支代码");
        System.out.println("test2222");
        System.out.println("test3333");
        System.out.println("test4444");
    }
}
