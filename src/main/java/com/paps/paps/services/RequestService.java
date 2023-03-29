package com.paps.paps.services;
import com.paps.paps.domains.Request;
import com.paps.paps.repository.RequestRepository;
import com.paps.paps.utils.AgeCalculator;
import com.paps.paps.utils.ValidatePassport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class RequestService {

    //Singleton pattern --> create only one object in memory
    @Autowired  private  RequestRepository requestRepository;

    public Request createRequest(Request request) {


        Integer size = ValidatePassport.checkNullandLength(request.getPassport_number());
        String first2Charcters = ValidatePassport.checkPassport(request.getPassport_number());
        Boolean checkDigits = ValidatePassport.checkDigits(request.getPassport_number());

        if (!checkDigits) {

            throw new RuntimeException("Passport Number after <EP> must be Digits ");
        }

        if (size == null) {

            throw new RuntimeException("Passport Number Can NOT be Null");
        }

        if (size != 9) {

            throw new RuntimeException("Passport Number Size Must Be 9 Characters");
        }

        if (!(first2Charcters).equalsIgnoreCase("EP")) {

            throw new RuntimeException("The First Two Characters Of A Passport Number Must Begin With <EP>");
        }
        Integer age = AgeCalculator.calculateDifference(request.getDate_of_birth(), LocalDate.now());
        if (age == null) {

            throw new RuntimeException("Date of Birth Can NOT be Null");
        }

        if (age < 18) {

            throw new RuntimeException("Your are Under Age, Use proxy.");
        }
        return requestRepository.save(request);
    }

    public Iterable<Request> getAllRequests() {
        return requestRepository.findAll();
    }


}
