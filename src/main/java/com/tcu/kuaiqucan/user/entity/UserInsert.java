package com.tcu.kuaiqucan.user.entity;

import javax.validation.constraints.*;

import lombok.Data;

@Data
public class UserInsert {

    private String name;
    private String username;

    @NotNull(message = "密码不能为空")
    @Size(min = 6, max = 16, message = "密码必须在6-16个字符串之间且不能用中文")
    private String password;

    @NotNull(message = "手机号码不能为空")
    @Pattern(regexp = "^1[035678]\\d{9}$", message = "请输入正确的手机号码")
    private String phone;
}
