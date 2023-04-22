package com.paps.paps.domains;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.Immutable;

@Entity (name = "validation_list")
@Immutable
@Data
@Table


public class Validation_List {


    @Id
    private long request_id;
    private String first_name;
    private String middle_name;
    private String last_name;
    private String date_of_birth;
    private String passport_number;
    private String email_address;
    private String payment;
    private String watchlist;
    private String request;

}
