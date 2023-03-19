package com.atlzq.springcloud.controller;

import com.atlzq.springcloud.common.CommonResult;
import com.atlzq.springcloud.entity.Payment;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
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
    //public static final String PAYMENT_URL = "http://localhost:8001";
    public static final String PAYMENT_URL = "http://CLOUD-GATEWAY";
    @Autowired
    private RestTemplate restTemplate;

    @ApiOperation("保存订单信息")
    @PostMapping("saveOrder")
    public CommonResult<Payment> savePayment(@RequestBody Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/savePayment", payment, CommonResult.class);
    }

    @ApiOperation("通过Id查询订单信息")
    @GetMapping("getPaymentById")
    public CommonResult getPaymentById(@RequestParam String id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/getPaymentById?id=" + id, CommonResult.class);
    }

    @ApiOperation("分页查询订单信息")
    @GetMapping("getPaymentByPage")
    public CommonResult getPaymentByPage(@RequestParam Integer pageNumber, @RequestParam Integer pageSize) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/getPaymentPage?pageNum=" + pageNumber +
                        "&pageSize" +
                        "=" + pageSize,
                CommonResult.class);
    }
}
