package com.atlzq.springcloud.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
* 
* @TableName payment
*/
@Data
public class Payment implements Serializable {

    /**
    * 主键
    */
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 
    */
    @ApiModelProperty("")
    private String serial;


}
