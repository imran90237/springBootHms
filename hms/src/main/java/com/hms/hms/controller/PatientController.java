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
        return "list"; // Refers to list.html
    }

    // Show form to add a new patient
    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("patient", new Patient());
        return "form"; // Refers to form.html
    }

    // Handle form submission
    @PostMapping
    public String addPatient(@ModelAttribute Patient patient) {
        patientRepository.save(patient);
        return "redirect:/patients"; // Redirect to the list after adding a patient
    }
}
