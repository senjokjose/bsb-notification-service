package com.bsbNotificationService;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@EnableCaching
@SpringBootApplication
public class BSBNotificationServiceApplication {

    public static void main(String[] args) {

      SpringApplication.run(BSBNotificationServiceApplication.class, args);

    }
}
