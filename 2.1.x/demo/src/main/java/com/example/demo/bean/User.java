package com.example.demo.bean;

import lombok.Data;

@Data
public class User {
    // 主键
    private Long id;
    // 用户名
    private String username;
    // 密码
    private String password;
    // 姓名
    private String name;

    //此处省略getter和setter方法 .. ..

}