package com.tcu.kuaiqucan.order.service;

import java.util.List;
import java.util.Optional;

import com.tcu.kuaiqucan.order.entity.Order;

public interface OrderService {
    public List<Order> getAllOrders();

    public void createOrder(Order order);

    public void deleteOrderByID(Integer id);

    public void updateOrderID(Integer id, Order order);

    public Optional<Order> retrieveOrderByID(Integer id);

    public Optional<Order> retrieveOrderByName(String name);
}
