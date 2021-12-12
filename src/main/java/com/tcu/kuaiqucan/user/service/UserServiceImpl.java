package com.tcu.kuaiqucan.user.service;

import java.util.*;

import com.tcu.kuaiqucan.user.entity.User;
import com.tcu.kuaiqucan.user.repository.UserBasicRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserBasicRepository repository;

    @Override
    public List<User> getAllUsers() {
        return  (List<User>) repository.findAll();
    }

    @Override
    public void createUser(User user) {
        User newUser = new User();
        newUser.setName(user.getName());
        newUser.setId(user.getId());
        newUser.setPhone(user.getPhone());
        newUser.setPassword(user.getPassword());
        repository.save(newUser);
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
