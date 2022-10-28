package com.example.assignment3.resource;

import com.example.assignment3.model.User;
import com.example.assignment3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserResource {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") int id){
        return userService.getUserById(id);
    }
    //POST  methods
    @PostMapping("/user")
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    //PUT methods
    @PutMapping("/user/{id}")
    public User updateUser(@PathVariable("id") int id, @RequestBody User user){
        return userService.updateUser(id, user);
    }

    //DELETE methods
    @DeleteMapping("/user")
    public User deleteUser (@RequestParam(name = "id")int id){
        return userService.deleteUser(id);
    }
}
