package com.paps.paps.domains;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "watchlist")
@Data

public class Watchlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long watchlist_id;

    @Size(max = 25)
    @Column(nullable = false)
    @NotBlank(message = "Court name cannot be empty")
    private String court_name;

    @Size(max = 15, min = 3)
    @Column(nullable = false)
    @NotBlank(message = "First name cannot be empty")
    private String first_name;

    @Size(max = 15, min = 3)
    @Column(nullable = false)
    @NotBlank(message = "Middle name cannot be empty")
    private String middle_name;

    @Size(max = 15, min = 3)
    @Column(nullable = false)
    @NotBlank(message = "Last name cannot be empty")
    private String last_name;

    @Column(nullable = false)
    @NotNull(message = "Date of birth must be set")
    private LocalDate date_of_birth;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Passport number cannot be empty")
    private String passport_number;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Court number cannot be empty")
    private String court_number;


    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private LocalDateTime creation_date = LocalDateTime.now();


    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private LocalDateTime modification_date = LocalDateTime.now();

    @Size(max = 15, min = 3)
    @Column(nullable = false)
    @NotBlank(message = "Creation user name cannot be empty")
    private String creation_user;

    @Size(max = 15, min = 3)
    @Column(nullable = false)
    @NotBlank(message = "Modification user name cannot be empty")
    private String modification_user;

    @Size(max = 25)
    @Column(nullable = false)
    @NotBlank(message = "Modification user name cannot be empty")
    private String watchlist_action;

    @Column(nullable = false)
    @NotBlank(message = "Watchlist status cannot be empty")
    private String watchlist_status = "A";


}
