package com.atlzq.springcloud.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TODO
 * @Date 2023/3/11 9:29
 * @Created by lzq
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    //响应码 如：200、404
    private Integer code;
    //响应消息 如：成功、失败
    private String message;
    //响应数据
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }

    public CommonResult(T data){
        this(200,"成功",data);
    }
}
