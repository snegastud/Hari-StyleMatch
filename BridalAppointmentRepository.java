package com.example.StyleMatch.repository;

import com.example.StyleMatch.model.BridalAppointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BridalAppointmentRepository extends JpaRepository<BridalAppointment, Long> {
}
