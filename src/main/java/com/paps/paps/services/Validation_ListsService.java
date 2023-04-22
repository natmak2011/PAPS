package com.paps.paps.services;

import com.paps.paps.domains.Validation_List;
import com.paps.paps.repository.ValidationListsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Validation_ListsService {

    //Singleton pattern --> create only one object in memory
    @Autowired  private ValidationListsRepository validationListsRepository;


      public Iterable<Validation_List> getAllValidation() {

        return validationListsRepository.findAll();
    }

    }



