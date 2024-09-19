package com.hms.hms.controller;

import com.hms.hms.model.Patient;
import com.hms.hms.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patients")  // API endpoint
public class PatientApiController {

    @Autowired
    private PatientRepository patientRepository;

    // Create a new patient (POST)
    @PostMapping
    public Patient addPatient(@RequestBody Patient patient) {
        return patientRepository.save(patient);
    }

    // Fetch all patients (GET)
    @GetMapping
    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
}
