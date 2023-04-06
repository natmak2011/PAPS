package com.paps.paps.services;

import com.paps.paps.domains.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.paps.paps.repository.UserRepo;

@Service
public class UserService {
    @Autowired private UserRepo userRepo;

    //String first_name, String middle_name, String last_name, String phone_number,
    // String email_address, LocalDateTime creation_date,String username,String password,String conf_password
    public User createnewuser(User user1) {
        return userRepo.save(user1);
    }
}