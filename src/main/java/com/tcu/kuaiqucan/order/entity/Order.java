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
    private int sender_id;
    private int user_id;
    private int good_id;
}
