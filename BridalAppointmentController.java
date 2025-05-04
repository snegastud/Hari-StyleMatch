package com.example.StyleMatch.controller;

import com.example.StyleMatch.model.BridalAppointment;
import com.example.StyleMatch.service.BridalAppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "http://127.0.0.1:5500")
public class BridalAppointmentController {
    @Autowired
    private final BridalAppointmentService service;

    public BridalAppointmentController(BridalAppointmentService service) {
        this.service = service;
    }

    @PostMapping("/bridal-booking")
    public String bookAppointment(@ModelAttribute BridalAppointment appointment) {
        service.save(appointment);
        return "Booking order confirm..!"; // Optional: create this page
    }
}
