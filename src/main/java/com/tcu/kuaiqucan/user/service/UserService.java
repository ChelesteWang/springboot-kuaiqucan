package com.tcu.kuaiqucan.user.service;

import java.util.List;
import java.util.Optional;

import com.tcu.kuaiqucan.user.entity.User;

public interface UserService {
    public List<User> getAllUsers();

    public void createUser(User user);

    public void deleteUserByID(Integer id);

    public void updateUserID(Integer id, User user);

    public Optional<User> retrieveUserByID(Integer id);

    public Optional<User> retrieveUserByName(String name);
}
