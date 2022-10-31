package com.example.assignment3.service;

import com.example.assignment3.model.User;
import com.example.assignment3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User saveUser(User user) {
        return userRepository.save(user);
    }
    public List<User> getAllUser() {
        return userRepository.findAll();
    }
    public User updateUser(User user) {
        return userRepository.save(user);
    }
/*
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }





    public User deleteUser(int id) {
        return userRepository.deleteUser(id);
    }

 */
}
