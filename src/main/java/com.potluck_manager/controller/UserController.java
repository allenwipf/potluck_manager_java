package com.potluck_manager.controller;


import com.potluck_manager.Service.UserService;
import com.potluck_manager.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.lang.reflect.Method;
import java.util.Collection;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Collection<User> getAllStudents(){
        return userService.getAllUsers();
    }


    @GetMapping(value = "/{id}")
    public User getUserbyId(@PathVariable("id") int id){
        return userService.getUserById(id);
    }

    @PostMapping(value = "/{id}")
    public void deleteUserById(@PathVariable("id")int id){
        userService.removeUserbyId(id);

    }

    @PutMapping
    public void updateUserById(@RequestBody User user){
        userService.updateUser(user);
    }

    @PostMapping
    public void insertUser(@RequestBody User user){
        userService.insertUser(user);
    }
}
