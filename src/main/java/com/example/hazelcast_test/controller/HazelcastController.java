package com.example.hazelcast_test.controller;

import com.example.hazelcast_test.service.HazelCastService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/hazelcast")
@AllArgsConstructor
public class HazelcastController {
    private final HazelCastService hazelCastService;

    @GetMapping
    public Boolean isLeader(){
        return hazelCastService.amITheLeader();
    }

}
