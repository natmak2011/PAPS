package com.paps.paps.services;
import com.paps.paps.domains.Request;
import com.paps.paps.repository.RequestRepository;
import com.paps.paps.utils.AgeCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RequestService {

    //Singleton pattern --> create only one object in memory
    @Autowired private RequestRepository requestRepository;

    public Request createRequest(Request request){

        AgeCalculator.calculateDifference(request.getDate_of_birth(), LocalDate.now());
       return requestRepository.save(request);
    }
}
