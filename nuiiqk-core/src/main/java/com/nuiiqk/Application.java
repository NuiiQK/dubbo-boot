package com.nuiiqk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

/**
 * 在Spring Boot启动类中我们加入@EnableDubbo注解，表示要开启dubbo功能:
 * 
 * @author nuiiqk
 */
@EnableDubbo
@SpringBootApplication
public class Application {

  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
    System.out.println("provider start complete");
  }

}
