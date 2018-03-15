package com.wishes.mobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

@EnableDiscoveryClient
@Configuration
@EnableAutoConfiguration
@SpringBootApplication
public class MobileApplication {

    public static void main(String[] args) {

        SpringApplication.run(MobileApplication.class,args);

    }

}
