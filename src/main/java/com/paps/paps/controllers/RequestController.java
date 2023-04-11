package com.paps.paps.controllers;

import com.paps.paps.domains.Request;
import com.paps.paps.services.RequestService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@Service
@Repository
public class RequestController {

    @Autowired private RequestService requestService;
    //@Autowired private RequestService.EmailService emailService;



    @PostMapping("/api/request")
    public ResponseEntity<Request> createRequest (@Valid @RequestBody Request request){



        Request savedRequest = requestService.createRequest(request);

        return new ResponseEntity<>(savedRequest, HttpStatus.CREATED);


    }




    @GetMapping("/api/requests/status")


    public Iterable<Request> getAllRequests() {
        return requestService.getAllRequests();
    }






}

