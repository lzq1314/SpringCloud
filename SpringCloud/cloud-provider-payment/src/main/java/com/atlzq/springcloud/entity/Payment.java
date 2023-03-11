package com.atlzq.springcloud.entity;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotNull;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

/**
* 
* @TableName payment
*/
@Data
public class Payment implements Serializable {

    /**
    * 主键
    */
    @NotNull(message="[主键]不能为空")
    @ApiModelProperty("主键")
    private Long id;
    /**
    * 
    */
    @Size(max= 200,message="编码长度不能超过200")
    @ApiModelProperty("")
    @Length(max= 200,message="编码长度不能超过200")
    private String serial;


}
