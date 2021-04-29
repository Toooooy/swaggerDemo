package com.zl.swaggerdemo.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

//@Api("用户实体类")与@ApiModel("用户实体类")等价
@ApiModel("用户实体类")//给实体类加中文注释的注解
public class User {

    @ApiModelProperty("用户名")//给字段加中文注释的注解
    public String username;
    public String password;
}
