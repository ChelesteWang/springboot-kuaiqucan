package com.tcu.kuaiqucan.sender.repository;

import java.util.List;
import java.util.Optional;

import com.tcu.kuaiqucan.sender.entity.Sender;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SenderBasicRepository extends PagingAndSortingRepository<Sender, Integer>{
    
    Optional<Sender> findByName(String name);
}
