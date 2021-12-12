package com.tcu.kuaiqucan.user.repository;

import java.util.List;
import java.util.Optional;

import com.tcu.kuaiqucan.user.entity.User;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserBasicRepository extends PagingAndSortingRepository<User, Integer>{
    
    Optional<User> findByName(String name);
}
