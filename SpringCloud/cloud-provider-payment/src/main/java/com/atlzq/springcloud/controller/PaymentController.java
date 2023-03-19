package com.atlzq.springcloud.controller;

import com.atlzq.springcloud.common.CommonResult;
import com.atlzq.springcloud.entity.Payment;
import com.atlzq.springcloud.service.PaymentService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description TODO
 * @Date 2023/3/11 11:48
 * @Created by lzq
 */
@Api
@RestController
@RequestMapping("payment")
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @Autowired
    private PaymentService paymentService;

    @PostMapping("savePayment")
    @ApiOperation("新增订单")
    public CommonResult savePayment(@RequestBody Payment payment){
        boolean save = paymentService.save(payment);
        return new CommonResult(save);
    }

    @GetMapping("getPaymentById")
    @ApiOperation("通过id查询订单")
    public CommonResult getPaymentById(@RequestParam String id){
        Payment payment = paymentService.getById(id);
        System.out.println("端口号"+serverPort);
        return new CommonResult(payment);
    }

    @GetMapping("getPaymentPage")
    @ApiOperation("分页查询订单")
    public CommonResult getPaymentPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize){
        Page<Payment> page = new Page<>(pageNum,pageSize);
        LambdaQueryWrapper<Payment> paymentLambdaQueryWrapper = new LambdaQueryWrapper<>();
        Page<Payment> paymentList = paymentService.page(page, paymentLambdaQueryWrapper);
        return new CommonResult(paymentList);
    }
}
