package com.example.assignment3.resource;

import com.example.assignment3.model.User;
import com.example.assignment3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @Autowired
    private UserService userService;

    //POST  methods
    @PostMapping
    public User saveUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/find")
    public List<User> getUserByID(@RequestParam(name = "id")String id){
        return userService.getUserById(id);
    }

    //PUT methods
    @PutMapping
    public User updateUser( @RequestBody User user){
        return userService.updateUser(user);
    }

    //DELETE methods
    @DeleteMapping
    public void deleteUser (@RequestParam(name = "id")String id){
         userService.deleteUser(id);
    }

}
