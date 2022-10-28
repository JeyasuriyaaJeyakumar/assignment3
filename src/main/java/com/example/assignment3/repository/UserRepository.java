package com.example.assignment3.repository;

import com.example.assignment3.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    List<User> userList = new ArrayList();

    //GET all user
    public List<User> getAllUser() {
        return userList;
    }

    //GET all user by ID
    public User getUserById(int id) {
        for (User user:userList){
            if (user.getId() == id){
                return user;
            }
        }
        return null;
    }

    //POST user
    public User saveUser(User user) {
        user.setId(userList.size() +1);
        userList.add(user);
        return user;
    }

    //PUT user
    public User updateUser(int id, User user) {
        for (User u:userList){
            if (u.getId() == id){
                u.setName(user.getName());
                u.setEmail(user.getEmail());
                u.setProfilePhotoUrl(user.getProfilePhotoUrl());
                return u;
            }
        }
        return null;
    }

    //DELETE user

    public User deleteUser(int id) {
        User deletedUser = null;
        for (User u:userList){
            if(u.getId() == id){
                deletedUser = u;
                userList.remove(u);
                return deletedUser;
            }
        }
        return deletedUser;
    }


}
