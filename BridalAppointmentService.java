package com.example.StyleMatch.service;

import com.example.StyleMatch.model.BridalAppointment;
import com.example.StyleMatch.repository.BridalAppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BridalAppointmentService {
    @Autowired
    private final BridalAppointmentRepository repo;

    public BridalAppointmentService(BridalAppointmentRepository repo) {
        this.repo = repo;
    }

    public void save(BridalAppointment appointment) {
        repo.save(appointment);
    }
}
