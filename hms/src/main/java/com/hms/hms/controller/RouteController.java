//package com.hms.hms.controller;
//
//import com.hms.hms.model.LabTest;
//import com.hms.hms.repository.LabTestRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api")
//public class RootController {
//
//    @Autowired
//    private LabTestRepository labTestRepository;
//
//    // Root endpoint: returns a welcome message
//    @GetMapping("/")
//    public ResponseEntity<String> rootMap() {
//        return ResponseEntity.ok("Welcome to the Hospital Management System API!");
//    }
//
//    // Test endpoint: verifies if the API is working
//    @GetMapping("/test")
//    public ResponseEntity<String> testURL() {
//        return ResponseEntity.ok("Test URL working successfully!");
//    }
//
//    // Greeting endpoint: returns a personalized greeting message
//    @GetMapping("/greet")
//    public ResponseEntity<String> greetUser(@RequestParam(name = "name", defaultValue = "Guest") String name) {
//        return ResponseEntity.ok("Hello, " + name + "!");
//    }
//
//    // LabTest CRUD operations
//
//    // 1. Get all LabTests
//    @GetMapping("/labTests")
//    public ResponseEntity<List<LabTest>> getAllLabTests() {
//        List<LabTest> labTests = labTestRepository.findAll();
//        return new ResponseEntity<>(labTests, HttpStatus.OK);
//    }
//
//    // 2. Get LabTest by ID
//    @GetMapping("/labTests/{id}")
//    public ResponseEntity<LabTest> getLabTestById(@PathVariable Long id) {
//        return labTestRepository.findById(id)
//                .map(labTest -> ResponseEntity.ok().body(labTest))
//                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
//    // 3. Create new LabTest
//    @PostMapping("/labTests")
//    public ResponseEntity<LabTest> createLabTest(@RequestBody LabTest labTest) {
//        LabTest savedLabTest = labTestRepository.save(labTest);
//        return new ResponseEntity<>(savedLabTest, HttpStatus.CREATED);
//    }
//
//    // 4. Update existing LabTest
//    @PutMapping("/labTests/{id}")
//    public ResponseEntity<LabTest> updateLabTest(
//            @PathVariable Long id,
//            @RequestBody LabTest labTestDetails) {
//        return labTestRepository.findById(id)
//                .map(labTest -> {
//                    labTest.setTitle(labTestDetails.getTitle());
//                    labTest.setCost(labTestDetails.getCost());
//                    labTest.setAvailable(labTestDetails.isAvailable());
//                    LabTest updatedLabTest = labTestRepository.save(labTest);
//                    return new ResponseEntity<>(updatedLabTest, HttpStatus.OK);
//                })
//                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//
//    // 5. Delete LabTest
//    @DeleteMapping("/labTests/{id}")
//    public ResponseEntity<Void> deleteLabTest(@PathVariable Long id) {
//        return labTestRepository.findById(id)
//                .map(labTest -> {
//                    labTestRepository.delete(labTest);
//                    return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
//                })
//                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
//    }
//}
