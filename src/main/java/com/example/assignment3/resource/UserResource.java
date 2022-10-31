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

    //PUT methods
    @PutMapping
    public User updateUser( @RequestBody User user){
        return userService.updateUser(user);
    }

    /*

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") int id){
        return userService.getUserById(id);
    }



    //DELETE methods
    @DeleteMapping("/user")
    public User deleteUser (@RequestParam(name = "id")int id){
        return userService.deleteUser(id);
    }

     */
}
