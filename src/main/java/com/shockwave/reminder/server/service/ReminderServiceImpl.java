package com.shockwave.reminder.server.service;

import com.shockwave.reminder.server.entity.Remind;
import com.shockwave.reminder.server.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReminderServiceImpl implements ReminderService{

    @Autowired
    private RemindRepository remindRepository;

    public List<Remind> getAll() {
        return remindRepository.findAll();
    }

    public Remind getById(long remindId) {
        return remindRepository.findOne(remindId);
    }

    public Remind save(Remind remind) {
        return remindRepository.saveAndFlush(remind);
    }

    public void delete(long remindId) {
        remindRepository.delete(remindId);
    }
}
