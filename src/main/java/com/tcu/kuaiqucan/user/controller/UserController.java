package com.tcu.kuaiqucan.user.controller;

import java.util.*;

import com.tcu.kuaiqucan.user.entity.User;
import com.tcu.kuaiqucan.user.service.UserServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    private UserServiceImpl service = new UserServiceImpl();

    @PostMapping("/user")
    public ResponseEntity<String> addUser(@RequestBody User user) {
        service.createUser(user);
        return ResponseEntity.ok("");
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity deleteUserById(@PathVariable("id") int id) {
        service.deleteUserByID(id);
        return ResponseEntity.ok("");
    }

    @GetMapping("/user")
    public ResponseEntity getUserByName(@RequestParam("name") String name) {
        Optional<User> results = service.retrieveUserByName(name);
        return ResponseEntity.ok(results);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity getUserById(@RequestParam("id") Integer id) {
        Optional<User> results = service.retrieveUserByID(id);
        return ResponseEntity.ok(results);
    }

    @GetMapping("/user/all")
    public ResponseEntity getAllUsers() {
        List<User> results = service.getAllUsers();
        return ResponseEntity.ok(results);
    }


}
