package com.cssl.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient          //启动后会自动注册进eureka服务中
public class ProviderApplication {

    public static void main(String[] args)	{
        SpringApplication.run(ProviderApplication.class, args);
    }

}
