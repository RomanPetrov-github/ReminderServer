package com.shockwave.reminder.server.entity;


import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "remind")
public class Remind {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "title", nullable = false, length = 50)
    private String remindTitle;

    @Column(name = "remindDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date remindDate;

    public Remind() {
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getRemindTitle() {
        return remindTitle;
    }
    public void setRemindTitle(String remindTitle) {
        this.remindTitle = remindTitle;
    }

    public Date getRemindDate() {
        return remindDate;
    }
    public void setRemindDate(Date remindDate) {
        this.remindDate = remindDate;
    }
}
