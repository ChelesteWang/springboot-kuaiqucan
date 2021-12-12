package com.tcu.kuaiqucan.order.entity;

import javax.validation.constraints.*;

import org.hibernate.validator.constraints.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.*;

import lombok.Data;

@Data
@Table("order")
public class Order {
    @Id
    private int id;
    private String name;
    private String description;
    private int number;
    private float price;
    private String sender_id;
    private String user_id;
    private String good_id;
}
