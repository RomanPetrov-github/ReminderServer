package com.shockwave.reminder.server.controller;

import com.shockwave.reminder.server.entity.Remind;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/reminder")
public class ReminderController {

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(){
        return getMockRemind();
    }

    private Remind getMockRemind() {
        Remind remind = new Remind();
        remind.setId(1);
        remind.setRemindTitle("My first Remind");
        remind.setRemindDate(new Date());
        return remind;
    }
}
