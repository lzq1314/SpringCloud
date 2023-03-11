package com.atlzq.springcloud.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atlzq.springcloud.entity.Payment;
import com.atlzq.springcloud.service.PaymentService;
import com.atlzq.springcloud.mapper.PaymentMapper;
import org.springframework.stereotype.Service;

/**
* @author lizhiqiang
* @description 针对表【payment】的数据库操作Service实现
* @createDate 2023-03-11 09:09:15
*/
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment>
    implements PaymentService{

}




