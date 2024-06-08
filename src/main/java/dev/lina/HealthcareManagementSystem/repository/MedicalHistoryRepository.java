package dev.lina.HealthcareManagementSystem.repository;

import dev.lina.HealthcareManagementSystem.model.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Long> {
}
