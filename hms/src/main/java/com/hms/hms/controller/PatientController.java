package com.hms.hms.controller;

import com.hms.hms.model.Patient;
import com.hms.hms.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    // Display all patients
    @GetMapping
    public String listPatients(Model model) {
        List<Patient> patients = patientRepository.findAll();
        model.addAttribute("patients", patients);
        return "list"; // Refers to list.html (patient listing page)
    }

    // Show form to add a new patient
    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "add_patient"; // Refers to add_patient.html
    }

    // Handle form submission for adding a new patient
    @PostMapping
    public String addPatient(@ModelAttribute Patient patient) {
        patientRepository.save(patient);
        return "redirect:/patients"; // Redirect to the patient list after saving
    }

    // Show form to edit an existing patient
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        model.addAttribute("patient", patient);
        return "edit_patient"; // Refers to edit_patient.html
    }

    // Handle form submission for updating a patient
    @PostMapping("/update")
    public String updatePatient(@ModelAttribute Patient patient) {
        patientRepository.save(patient); // Update the patient information
        return "redirect:/patients"; // Redirect to the patient list after updating
    }

    // Delete a patient by ID
    @GetMapping("/delete/{id}")
    public String deletePatient(@PathVariable Long id) {
        patientRepository.deleteById(id);
        return "redirect:/patients"; // Redirect to the patient list after deletion
    }
}
