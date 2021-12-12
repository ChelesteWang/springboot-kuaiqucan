package com.tcu.kuaiqucan.user.service;

import java.util.*;

import com.tcu.kuaiqucan.user.entity.User;
import com.tcu.kuaiqucan.user.entity.UserInsert;
import com.tcu.kuaiqucan.user.repository.UserBasicRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserBasicRepository repository;

    @Override
    public List<User> getAllUsers() {
        return (List<User>) repository.findAll();
    }

    @Override
    public void createUser(UserInsert user) {
        User user1 = new User();
        user1.setName(user.getName());
        user1.setPassword(user.getPassword());
        user1.setPhone(user.getPhone());
        user1.setUsername(user.getUsername());
        repository.save(user1);
    }

    @Override
    public void deleteUserByID(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateUserID(Integer id, User user) {
        repository.save(user);
    }

    @Override
    public Optional<User> retrieveUserByID(Integer id) {
        return repository.findById(id);

    }

    @Override
    public Optional<User> retrieveUserByName(String name) {
        return repository.findByName(name);
    }

}
