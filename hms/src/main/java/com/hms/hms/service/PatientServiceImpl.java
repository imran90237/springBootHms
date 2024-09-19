package com.hms.hms.service.impl;

import com.hms.hms.model.Patient;
import com.hms.hms.repository.PatientRepository;
import com.hms.hms.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }

    @Override
    @Transactional
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient getPatientById(Long id) {
        return patientRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Patient not found with id: " + id));
    }

    @Override
    @Transactional
    public void updatePatient(Long id, Patient updatedPatient) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Patient not found with id: " + id));

        patient.setName(updatedPatient.getName());
        patient.setAge(updatedPatient.getAge());
        patient.setAddress(updatedPatient.getAddress());
        // Additional fields can be updated here if needed

        patientRepository.save(patient);
    }

    @Override
    @Transactional
    public void deletePatient(Long id) {
        if (!patientRepository.existsById(id)) {
            throw new IllegalArgumentException("Patient not found with id: " + id);
        }
        patientRepository.deleteById(id);
    }
}
