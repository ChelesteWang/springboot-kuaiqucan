package com.tcu.kuaiqucan.order.entity;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.*;
import org.springframework.data.relational.core.mapping.*;

import lombok.Data;

@Data
@Table("order")
public class Order {
    @NotNull
    private String id;
    @NotNull
    @Length(min = 2, max = 10)
    private String name;
    @NotNull
    private String description;
    private float price;
    private String sender_id;
    private String user_id;
    private String good_id;
}
