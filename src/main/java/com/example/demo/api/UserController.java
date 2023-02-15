package com.example.demo.api;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v2/user")
@RestController
public class UserController {

    @Autowired
    private UserRepository userRepo;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User newUser){
        return userRepo.save(newUser);
    }

    @GetMapping("/getAllUser")
    public List<User> getAllUser(){
        return userRepo.findAll();
    }
}
