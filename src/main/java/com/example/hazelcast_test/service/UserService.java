package com.example.hazelcast_test.service;

import com.example.hazelcast_test.model.User;
import com.example.hazelcast_test.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@AllArgsConstructor
@Service
public class UserService {
    private final UserRepository userRepository;

    @Cacheable(value = "nickname", key = "#id")
    public Optional<User> getUser(String id){
        return userRepository.findById(id);
    }

    @Cacheable(value = "nickname", key = "#id")
    public User updateUser(User user) {
        return userRepository.save(user);
    }
}
