package com.zhuxiang.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: zhuxiang
 * @date: 2018/9/10 16:58
 * @description:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ShoppingAuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingAuthApplication.class, args);
    }
}
