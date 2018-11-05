package com.zhuxiang.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author: zhuxiang
 * @date: 2018/9/3 17:01
 * @description:
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringCloudApplication
public class ShoppingGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingGatewayApplication.class, args);
    }
}
