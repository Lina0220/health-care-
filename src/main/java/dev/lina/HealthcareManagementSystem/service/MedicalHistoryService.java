package dev.lina.HealthcareManagementSystem.service;

import dev.lina.HealthcareManagementSystem.model.MedicalHistory;
import dev.lina.HealthcareManagementSystem.repository.MedicalHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicalHistoryService {

    @Autowired
    private MedicalHistoryRepository medicalHistoryRepository;

    public MedicalHistory addMedicalHistory(MedicalHistory medicalHistory) {
        return medicalHistoryRepository.save(medicalHistory);
    }

    public MedicalHistory updateMedicalHistory(Long id, MedicalHistory medicalHistory) {
        medicalHistory.setId(id);
        return medicalHistoryRepository.save(medicalHistory);
    }

    public void deleteMedicalHistory(Long id) {
        medicalHistoryRepository.deleteById(id);
    }

    public MedicalHistory getMedicalHistoryById(Long id) {
        return medicalHistoryRepository.findById(id).orElse(null);
    }

    public List<MedicalHistory> getAllMedicalHistories() {
        return medicalHistoryRepository.findAll();
    }
}

