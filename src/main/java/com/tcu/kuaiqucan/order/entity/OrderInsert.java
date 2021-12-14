package com.tcu.kuaiqucan.order.entity;

import lombok.Data;

@Data
public class OrderInsert {

    private String name;
    private String description;
    private int number;
    private float price;
    private int sender_id;
    private int user_id;
    private int good_id;
}
