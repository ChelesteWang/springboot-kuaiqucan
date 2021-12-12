package com.tcu.kuaiqucan.sender.entity;

import javax.validation.constraints.*;

import lombok.Data;

@Data
public class SenderInsert {

    private String name;

    @NotNull(message = "手机号码不能为空")
    @Pattern(regexp = "^1[035678]\\d{9}$", message = "请输入正确的手机号码")
    private String phone;
}
