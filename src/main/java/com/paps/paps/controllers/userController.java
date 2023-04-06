package com.paps.paps.controllers;


import com.paps.paps.domains.User;
import com.paps.paps.services.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping
@Service
public class userController {

    @Autowired private UserService userservice;

            @PostMapping( "/api/users")
           public ResponseEntity<User> createnewuser( @Valid @RequestBody User user){

      User savedUser = userservice.createnewuser(user);

                return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }
}
