package com.example.StyleMatch.controller;

import com.example.StyleMatch.model.Appointment;
import com.example.StyleMatch.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin (origins = "http://127.0.0.1:5500")
public class AppointmentController {
    @Autowired
    private final AppointmentService service;

    public AppointmentController(AppointmentService service) {
        this.service = service;
    }

    @PostMapping("/api/appointments")
    public String bookAppointment(@ModelAttribute Appointment appointment) {
        service.save(appointment);
        return "Appointment booked successfully!";
    }


}
