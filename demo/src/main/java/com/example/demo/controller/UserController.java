package com.example.demo.controller;


import com.example.demo.entity.User;
import com.example.demo.repo.UserReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserReponsitory userReponsitory;
    @GetMapping("/get-all-user")
    public ResponseEntity<?> getAllUser(){
        List<User> users = userReponsitory.findAll();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
