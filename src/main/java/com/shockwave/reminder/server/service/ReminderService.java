package com.shockwave.reminder.server.service;


import com.shockwave.reminder.server.entity.Remind;
import java.util.List;

public interface ReminderService {

    List<Remind> getAll();
    Remind getById(long remindId);
    Remind save(Remind remind);
    void delete(long remindId);
}
