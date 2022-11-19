package com.example.hazelcast_test.controller;

import com.example.hazelcast_test.model.User;
import com.example.hazelcast_test.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@CrossOrigin(origins ="http://localhost:3000/")
@RestController
@RequestMapping("api/user")
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public Optional<User> getUser(@RequestBody User user){
        return userService.getUser(user.getId());
    }

    @PostMapping
    public User update(@RequestBody User user) {
        return userService.updateUser(user);
    }
}
