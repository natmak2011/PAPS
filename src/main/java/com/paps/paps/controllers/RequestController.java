package com.paps.paps.controllers;

import com.paps.paps.domains.Request;
import com.paps.paps.services.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class RequestController {

    @Autowired private RequestService requestService;

    @PostMapping("/api/requests")
    public Request createRequest (@RequestBody Request request){

        return requestService.createRequest(request);

    }


}
