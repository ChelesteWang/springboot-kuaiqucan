package com.tcu.kuaiqucan.order.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;

import com.tcu.kuaiqucan.order.entity.*;

@RestController
@RequestMapping("/api/v1")
@Validated
public class OrderController {

    private List<Order> orders = new ArrayList<>();

    @PostMapping("/order")
    public ResponseEntity<List<Order>> addOrder(@RequestBody Order order) {
        orders.add(order);
        return ResponseEntity.ok(orders);
    }

    @DeleteMapping("/order/{id}")
    public ResponseEntity deleteOrderById(@PathVariable("id") int id) {
        orders.remove(id);
        return ResponseEntity.ok(orders);
    }

    @GetMapping("/order")
    public ResponseEntity getOrderByName(@RequestParam("name") String name) {
        List<Order> results = orders.stream().filter(order -> order.getName().equals(name))
                .collect(Collectors.toList());
        return ResponseEntity.ok(results);
    }

    @GetMapping("/order/{id}")
    public ResponseEntity getOrderById(@RequestParam("id") String id) {
        List<Order> results = orders.stream().filter(order -> order.getId().equals(id)).collect(Collectors.toList());
        return ResponseEntity.ok(results);
    }

    @GetMapping("/order/all")
    public ResponseEntity getAllOrder() {
        return ResponseEntity.ok(orders);
    }
}
