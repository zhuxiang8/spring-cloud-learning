package com.zhuxiang.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: zhuxiang
 * @date: 2018/9/14 14:59
 * @description:
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ShoppingProductEsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingProductEsApplication.class, args);
    }

}
