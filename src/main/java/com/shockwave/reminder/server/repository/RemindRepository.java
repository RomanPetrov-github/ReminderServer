package com.shockwave.reminder.server.repository;


import com.shockwave.reminder.server.entity.Remind;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RemindRepository extends JpaRepository<Remind, Long>{
}
