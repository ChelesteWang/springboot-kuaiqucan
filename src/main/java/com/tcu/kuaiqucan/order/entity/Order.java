package com.tcu.kuaiqucan.order.entity;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.*;


import lombok.Data;

@Data
public class Order {
    @NotNull
    private String id;
    @NotNull
    @Length(min = 2, max = 10)
    private String name;
    @NotNull
    private String description;
    private float price;
}
