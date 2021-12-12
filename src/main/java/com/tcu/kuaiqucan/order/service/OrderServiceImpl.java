package com.tcu.kuaiqucan.order.service;

import java.util.*;

import com.tcu.kuaiqucan.order.entity.Order;
import com.tcu.kuaiqucan.order.repository.OrderBasicRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderBasicRepository repository;

    @Override
    public List<Order> getAllOrders() {
        return (List<Order>) repository.findAll();
    }

    @Override
    public void createOrder(Order order) {
        repository.save(order);
    }

    @Override
    public void deleteOrderByID(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateOrderID(Integer id, Order order) {
        repository.save(order);
    }

    @Override
    public Optional<Order> retrieveOrderByID(Integer id) {
        return repository.findById(id);

    }

    @Override
    public Optional<Order> retrieveOrderByName(String name) {
        return repository.findByName(name);
    }

}
