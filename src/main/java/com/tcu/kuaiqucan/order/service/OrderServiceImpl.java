package com.tcu.kuaiqucan.order.service;

import java.util.*;

import com.tcu.kuaiqucan.order.entity.Order;
import com.tcu.kuaiqucan.order.entity.OrderInsert;
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
    public void createOrder(OrderInsert order) {
        Order order1 = new Order();
        order1.setName(order.getName());
        order1.setDescription(order.getDescription());
        order1.setNumber(order.getNumber());
        order1.setPrice(order.getPrice());
        order1.setUser_id(order.getUser_id());
        order1.setSender_id(order.getSender_id());
        order1.setGood_id(order.getGood_id());
        repository.save(order1);
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

    @Override
    public List<Order> retrieveOrderByUserID(Integer userID) {
        return repository.findByUserId(userID);
    }

    @Override
    public List<Order> retrieveOrderBySenderID(Integer senderID) {
        return repository.findBySenderId(senderID);
    }

    

}
