package com.tcu.kuaiqucan.order.repository;

import java.util.List;
import java.util.Optional;

import com.tcu.kuaiqucan.order.entity.Order;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderBasicRepository extends PagingAndSortingRepository<Order, Integer> {


    public static final String SELECT_ORDER_BY_USER_ID = "SELECT * FROM `order` WHERE order.user_id = :user_id ORDER BY id DESC";
    
    public static final String SELECT_ORDER_BY_SENDER_ID = "SELECT * FROM `order` WHERE order.sender_id = :sender_id ORDER BY id DESC";

    Optional<Order> findByName(String name);

    @Query(SELECT_ORDER_BY_USER_ID)   
    List<Order> findByUserId(int user_id);

    @Query(SELECT_ORDER_BY_SENDER_ID)
    List<Order> findBySenderId(int sender_id);
}
