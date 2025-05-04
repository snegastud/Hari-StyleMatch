package com.example.StyleMatch.repository;

import com.example.StyleMatch.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository  extends JpaRepository<Appointment, Long> {

}
