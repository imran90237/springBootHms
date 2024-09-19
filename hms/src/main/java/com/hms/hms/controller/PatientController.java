package com.hms.hms.controller;

import com.hms.hms.model.Patient;
import com.hms.hms.service.PatientService; // Ensure this is imported
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")


public class PatientController {


    @Autowired
    private PatientService patientService;

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @PostMapping(path = "/add")
    public @ResponseBody Patient savePatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }

    @PutMapping("/{id}")
    public void updatePatient(@PathVariable Long id, @RequestBody Patient updatedPatient) {
        patientService.updatePatient(id, updatedPatient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id) {
        patientService.deletePatient(id);
    }
}
