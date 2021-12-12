package com.tcu.kuaiqucan.order.entity;

import lombok.Data;

@Data
public class OrderInsert {

    private String name;
    private String description;
    private int number;
    private float price;
    private String sender_id;
    private String user_id;
    private String good_id;
}
