package com.tcu.kuaiqucan.user.controller;

import java.util.*;
import java.util.stream.Collectors;

import com.tcu.kuaiqucan.user.entity.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    private List<User> users = new ArrayList<>();

    @GetMapping("/user")
    public ResponseEntity getOrderByName(@RequestParam("name") String name) {
        List<User> results = users.stream().filter(user -> user.getUsername().equals(name))
                .collect(Collectors.toList());
        return ResponseEntity.ok(results);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity getOrderById(@RequestParam("id") String id) {
        List<User> results = users.stream().filter(user -> user.getId().equals(id)).collect(Collectors.toList());
        return ResponseEntity.ok(results);
    }

    @GetMapping("/user/all")
    public ResponseEntity getAllUsers() {
        return ResponseEntity.ok(users);
    }

}
