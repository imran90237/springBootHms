package com.hms.hms.service;

import com.hms.hms.model.Patient;

import java.util.List;

public interface PatientService {

    List<Patient> getAllPatients();

    Patient savePatient(Patient patient);

    Patient getPatientById(Long id);

    void updatePatient(Long id, Patient updatedPatient);

    void deletePatient(Long id);
}
