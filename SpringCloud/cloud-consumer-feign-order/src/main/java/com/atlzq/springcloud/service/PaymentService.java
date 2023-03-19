package com.atlzq.springcloud.service;

import com.atlzq.springcloud.common.CommonResult;
import com.atlzq.springcloud.entity.Payment;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentService{

    @GetMapping("/order/getPaymentById")
    public CommonResult<Payment> getPaymentById(@Param("id") String id);
}
