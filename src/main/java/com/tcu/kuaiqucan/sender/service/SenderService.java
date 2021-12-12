package com.tcu.kuaiqucan.sender.service;

import java.util.List;
import java.util.Optional;

import com.tcu.kuaiqucan.sender.entity.Sender;
import com.tcu.kuaiqucan.sender.entity.SenderInsert;

public interface SenderService {
    public List<Sender> getAllSenders();

    public void createSender(SenderInsert sender);

    public void deleteSenderByID(Integer id);

    public void updateSenderID(Integer id, Sender sender);

    public Optional<Sender> retrieveSenderByID(Integer id);

    public Optional<Sender> retrieveSenderByName(String name);
}
