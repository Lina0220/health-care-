package dev.lina.HealthcareManagementSystem.repository;

import dev.lina.HealthcareManagementSystem.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
}

