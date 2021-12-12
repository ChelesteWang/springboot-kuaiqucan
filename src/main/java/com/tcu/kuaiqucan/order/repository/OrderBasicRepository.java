package com.tcu.kuaiqucan.order.repository;

import java.util.List;
import java.util.Optional;

import com.tcu.kuaiqucan.order.entity.Order;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderBasicRepository extends PagingAndSortingRepository<Order, Integer>{
    
    Optional<Order> findByName(String name);

}
