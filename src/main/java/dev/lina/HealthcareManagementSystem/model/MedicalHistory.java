package dev.lina.HealthcareManagementSystem.model;


import java.time.LocalDateTime;

@Entity
public class MedicalHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long patientId;
    private String diagnosis;
    private LocalDateTime date;

    // Constructors
    public MedicalHistory() {
    }

    public MedicalHistory(Long patientId, String diagnosis, LocalDateTime date) {
        this.patientId = patientId;
        this.diagnosis = diagnosis;
        this.date = date;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
}

