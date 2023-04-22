package com.paps.paps.controllers;

import com.paps.paps.domains.Validation_List;
import com.paps.paps.services.Validation_ListsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@Service
public class ValidationListsController {

    @Autowired private Validation_ListsService validation_listsService;
    @GetMapping("/api/request/validation")


    public Iterable<Validation_List> getAllRequests() {return validation_listsService.getAllValidation();
    }


}
