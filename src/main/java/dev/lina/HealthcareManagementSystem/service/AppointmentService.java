package dev.lina.HealthcareManagementSystem.service;

import dev.lina.HealthcareManagementSystem.model.Appointment;
import dev.lina.HealthcareManagementSystem.repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {

    @Autowired
    private AppointmentRepository appointmentRepository;

    public Appointment scheduleAppointment(Appointment appointment) {
        return appointmentRepository.save(appointment);
    }

    public Appointment updateAppointment(Long id, Appointment appointment) {
        Optional<Appointment> existingAppointment = appointmentRepository.findById(id);
        if (existingAppointment.isPresent()) {
            appointment.setId(id);
            return appointmentRepository.save(appointment);
        } else {
            throw new RuntimeException("Appointment not found with id " + id);
        }
    }

    public void cancelAppointment(Long id) {
        appointmentRepository.deleteById(id);


    public <__TMP__> __TMP__ getAllAppointments() {
    }

    public <__TMP__> __TMP__ getAllAppointments() {
    }

    public <__TMP__> __TMP__ getAppointmentById() {
    }