//package com.hms.hms.service;
//
//import com.hms.hms.model.User;
//import com.hms.hms.repository.UserRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class UserServiceImpl implements UserService {
//
//    @Autowired
//    private UserRepo userRepo;
//
//    // Method to get all users
//    @Override
//    public List<User> getAllUsers() {
//        return userRepo.findAll();
//    }
//
//    // Method to save a user object
//    @Override
//    public User saveUser(User user) {
//        return userRepo.save(user);
//    }
//
//    // Method to fetch a user by ID
//    @Override
//    public User getUserById(Integer id) {
//        return userRepo.findById(id).orElse(null);
//    }
//}
