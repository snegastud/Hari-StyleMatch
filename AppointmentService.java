package com.example.StyleMatch.service;

import com.example.StyleMatch.model.Appointment;
import com.example.StyleMatch.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    @Autowired
    private final AppointmentRepository repo;

    public AppointmentService(AppointmentRepository repo) {
        this.repo = repo;
    }

    public Appointment save(Appointment appointment) {
        return repo.save(appointment);
    }
}
