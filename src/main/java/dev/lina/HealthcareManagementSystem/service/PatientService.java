package dev.lina.HealthcareManagementSystem.service;

import dev.lina.HealthcareManagementSystem.model.Patient;
import dev.lina.HealthcareManagementSystem.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public Patient addPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient updatePatient(Long id, Patient patient) {
        Optional<Patient> existingPatient = patientRepository.findById(id);
        if (existingPatient.isPresent()) {
            patient.setId(id);
            return patientRepository.save(patient);
        } else {
            throw new RuntimeException("Patient not found with id " + id);
        }
    }

    public void deletePatient(Long id) {
        patientRepository.deleteById(id);
    }

    public Patient getPatientById(Long id) {
        return patientRepository.findById(id).orElseThrow(() -> new RuntimeException("Patient not found with id " + id));
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}

