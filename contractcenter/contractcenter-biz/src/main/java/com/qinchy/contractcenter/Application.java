package com.qinchy.contractcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Administrator on 2017/6/8.
 */
@SpringBootApplication
@ImportResource(locations = {"classpath:spring-dubbo-provider.xml"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
