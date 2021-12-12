package com.tcu.kuaiqucan.sender.controller;

import java.util.*;

import com.tcu.kuaiqucan.sender.entity.Sender;
import com.tcu.kuaiqucan.sender.entity.SenderInsert;
import com.tcu.kuaiqucan.sender.service.SenderServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class SenderController {

    @Autowired
    private SenderServiceImpl service = new SenderServiceImpl();

    @PostMapping("/sender")
    public ResponseEntity<String> addSender(@RequestBody SenderInsert sender) {
        service.createSender(sender);
        return ResponseEntity.ok("");
    }

    @DeleteMapping("/sender/{id}")
    public ResponseEntity deleteSenderById(@PathVariable("id") int id) {
        service.deleteSenderByID(id);
        return ResponseEntity.ok("");
    }

    @GetMapping("/sender")
    public ResponseEntity getSenderByName(@RequestParam("name") String name) {
        Optional<Sender> results = service.retrieveSenderByName(name);
        return ResponseEntity.ok(results);
    }

    @GetMapping("/sender/{id}")
    public ResponseEntity getSenderById(@RequestParam("id") Integer id) {
        Optional<Sender> results = service.retrieveSenderByID(id);
        return ResponseEntity.ok(results);
    }

    @GetMapping("/sender/all")
    public ResponseEntity getAllSenders() {
        List<Sender> results = service.getAllSenders();
        return ResponseEntity.ok(results);
    }

}
