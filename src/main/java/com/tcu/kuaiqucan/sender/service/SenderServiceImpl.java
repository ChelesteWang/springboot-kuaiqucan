package com.tcu.kuaiqucan.sender.service;

import java.util.*;

import com.tcu.kuaiqucan.sender.entity.Sender;
import com.tcu.kuaiqucan.sender.entity.SenderInsert;
import com.tcu.kuaiqucan.sender.repository.SenderBasicRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SenderServiceImpl implements SenderService {

    @Autowired
    private SenderBasicRepository repository;

    @Override
    public List<Sender> getAllSenders() {
        return (List<Sender>) repository.findAll();
    }

    @Override
    public void createSender(SenderInsert sender) {
        Sender sender1 = new Sender();
        sender1.setName(sender.getName());
        sender1.setPhone(sender.getPhone());
        repository.save(sender1);
    }

    @Override
    public void deleteSenderByID(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateSenderID(Integer id, Sender sender) {
        repository.save(sender);
    }

    @Override
    public Optional<Sender> retrieveSenderByID(Integer id) {
        return repository.findById(id);

    }

    @Override
    public Optional<Sender> retrieveSenderByName(String name) {
        return repository.findByName(name);
    }

}
