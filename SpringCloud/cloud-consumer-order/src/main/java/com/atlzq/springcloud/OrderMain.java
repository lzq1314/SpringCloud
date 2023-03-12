package com.atlzq.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Description TODO
 * @Date 2023/3/11 12:55
 * @Created by lzq
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class OrderMain {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain.class,args);
    }
}
