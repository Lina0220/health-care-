package dev.lina.HealthcareManagementSystem.controller;

import dev.lina.HealthcareManagementSystem.model.MedicalHistory;
import dev.lina.HealthcareManagementSystem.service.MedicalHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/medicalHistories")
public class MedicalHistoryController {

    @Autowired
    private MedicalHistoryService medicalHistoryService;

    @PostMapping
    public MedicalHistory addMedicalHistory(@RequestBody MedicalHistory medicalHistory) {
        return medicalHistoryService.addMedicalHistory(medicalHistory);
    }

    @PutMapping("/{id}")
    public MedicalHistory updateMedicalHistory(@PathVariable Long id, @RequestBody MedicalHistory medicalHistory) {
        return medicalHistoryService.updateMedicalHistory(id, medicalHistory);
    }

    @DeleteMapping("/{id}")
    public void deleteMedicalHistory(@PathVariable Long id) {
        medicalHistoryService.deleteMedicalHistory(id);
    }

    @GetMapping("/{id}")
    public MedicalHistory getMedicalHistory(@PathVariable Long id) {
        return medicalHistoryService.getMedicalHistoryById(id);
    }

    @GetMapping
    public List<MedicalHistory> getAllMedicalHistories() {
        return medicalHistoryService.getAllMedicalHistories();
    }
}

