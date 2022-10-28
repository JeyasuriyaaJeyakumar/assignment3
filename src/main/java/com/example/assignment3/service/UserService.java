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


    public List<User> getAllUser() {
        return userRepository.getAllUser();
    }
    public User getUserById(int id) {
        return userRepository.getUserById(id);
    }

    public User saveUser(User user) {
        return userRepository.saveUser(user);
    }


    public User updateUser(int id, User user) {
        return userRepository.updateUser(id, user);
    }

    public User deleteUser(int id) {
        return userRepository.deleteUser(id);
    }
}
