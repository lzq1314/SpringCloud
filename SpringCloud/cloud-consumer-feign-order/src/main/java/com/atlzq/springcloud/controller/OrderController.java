package com.atlzq.springcloud.controller;

import com.atlzq.springcloud.common.CommonResult;
import com.atlzq.springcloud.entity.Payment;
import com.atlzq.springcloud.service.PaymentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * @Description TODO
 * @Date 2023/3/11 13:09
 * @Created by lzq
 */
@Api
@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private PaymentService paymentService;

    @ApiOperation("通过Id查询订单信息")
    @GetMapping("getPaymentById")
    public CommonResult getPaymentById(@RequestParam String id) {
        return paymentService.getPaymentById(id);
    }
}
