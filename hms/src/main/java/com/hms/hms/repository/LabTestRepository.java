//package com.hms.hms.repository;
//
//import com.hms.hms.model.LabTest;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import java.util.List;
//
//@Repository
//public interface LabTestRepository extends JpaRepository<LabTest, Long> {
//
//    // Custom query method to find LabTests by title
//    List<LabTest> findByTitle(String title);
//
//    // Custom query method to find LabTests with a cost greater than a specified amount
//    List<LabTest> findByCostGreaterThan(double cost);
//
//    // Custom query method to find LabTests by availability status
//    List<LabTest> findByIsAvailable(boolean isAvailable);
//
//    // Custom query method to find LabTests by title and availability
//    List<LabTest> findByTitleAndIsAvailable(String title, boolean isAvailable);
//}
