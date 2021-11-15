package com.tcu.kuaiqucan.order.entity;

import lombok.Data;

@Data
public class Order {
    private String id;
    private String name;
    private String description;
    private float price;
}
