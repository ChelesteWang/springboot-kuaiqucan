package com.tcu.kuaiqucan.sender.entity;

import javax.validation.constraints.*;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Table("sender")
public class Sender {
    @NotNull(message = "ID账号不能为空")
    @Size(min = 6, max = 16, message = "ID账号必须在6-16个字符串之间且不能用中文")
    @Id
    private int id;

    private String name;

    @NotNull(message = "手机号码不能为空")
    @Pattern(regexp = "^1[035678]\\d{9}$", message = "请输入正确的手机号码")
    private String phone;
}
