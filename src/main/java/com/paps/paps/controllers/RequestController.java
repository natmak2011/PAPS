package com.paps.paps.controllers;

import com.paps.paps.domains.Request;
import com.paps.paps.services.RequestService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RequestController {

    @Autowired private RequestService requestService;

    @PostMapping("/api/requests")
    public ResponseEntity<Request> createRequest (@Valid @RequestBody Request request){

        Request savedRequest = requestService.createRequest(request);

        return new ResponseEntity<Request>(savedRequest, HttpStatus.CREATED);

    }


}
