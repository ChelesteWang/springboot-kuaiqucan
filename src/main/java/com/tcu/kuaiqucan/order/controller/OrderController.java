package com.tcu.kuaiqucan.order.controller;

import java.util.*;

import com.tcu.kuaiqucan.order.entity.Order;
import com.tcu.kuaiqucan.order.entity.OrderInsert;
import com.tcu.kuaiqucan.order.service.OrderServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class OrderController {

    @Autowired
    private OrderServiceImpl service = new OrderServiceImpl();

    @PostMapping("/order")
    public ResponseEntity<String> addOrder(@RequestBody OrderInsert order) {
        service.createOrder(order);
        return ResponseEntity.ok("");
    }

    @DeleteMapping("/order/{id}")
    public ResponseEntity deleteOrderById(@PathVariable("id") int id) {
        service.deleteOrderByID(id);
        return ResponseEntity.ok("");
    }

    @GetMapping("/order")
    public ResponseEntity getOrderByName(@RequestParam("name") String name) {
        Optional<Order> results = service.retrieveOrderByName(name);
        return ResponseEntity.ok(results);
    }

    @GetMapping("/order/{id}")
    public ResponseEntity getOrderById(@RequestParam("id") Integer id) {
        Optional<Order> results = service.retrieveOrderByID(id);
        return ResponseEntity.ok(results);
    }

    @GetMapping("/order/all")
    public ResponseEntity getAllOrders() {
        List<Order> results = service.getAllOrders();
        return ResponseEntity.ok(results);
    }

}
