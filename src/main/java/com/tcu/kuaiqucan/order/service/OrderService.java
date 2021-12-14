package com.tcu.kuaiqucan.order.service;

import java.util.List;
import java.util.Optional;

import com.tcu.kuaiqucan.order.entity.Order;
import com.tcu.kuaiqucan.order.entity.OrderInsert;

public interface OrderService {
    public List<Order> getAllOrders();

    public void createOrder(OrderInsert order);

    public void deleteOrderByID(Integer id);

    public void updateOrderID(Integer id, Order order);

    public Optional<Order> retrieveOrderByID(Integer id);

    public Optional<Order> retrieveOrderByName(String name);

    public List<Order> retrieveOrderByUserID(Integer userID);

    public List<Order> retrieveOrderBySenderID(Integer senderID);
}
