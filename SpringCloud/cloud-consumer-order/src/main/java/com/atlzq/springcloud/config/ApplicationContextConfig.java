package com.atlzq.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @Date 2023/3/11 13:13
 * @Created by lzq
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    @LoadBalanced//使用此注解赋予restTemplate负载均衡能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
