package com.RestAPI.Rest;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * UserController
 *
 * @author xuanl
 * @version 01-00
 * @since 7/22/2024
 */
@RestController
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @GetMapping("/")
    public String index() {
        return "hellooooo";
    }

    @GetMapping("/user")
    public List<UserEntity> user() {
        List<UserEntity> s = userRepo.findAll();
        return s;
    }

    @PostMapping("/user/create")
    public UserEntity saveUser(@RequestBody UserEntity user) {
        return userRepo.save(user);
    }
}
