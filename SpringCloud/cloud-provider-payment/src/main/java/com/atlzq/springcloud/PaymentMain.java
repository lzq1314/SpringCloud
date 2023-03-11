package com.atlzq.springcloud;

import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description TODO
 * @Date 2023/2/21 22:33
 * @Created by lzq
 */
@SpringBootApplication
public class PaymentMain {
    public static void main(String[] args) {
        LogFactory.useCustomLogging(StdOutImpl.class);
        SpringApplication.run(PaymentMain.class,args);
    }
}
