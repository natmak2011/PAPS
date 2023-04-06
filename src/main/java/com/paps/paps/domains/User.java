package com.paps.paps.domains;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "Backoffice_User")
@Data

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long user_id;

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

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Phone number cannot be empty")
    private String phone_number;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Email address cannot be empty")
    @Email
    private String email_address;

    /*@Column(nullable = false)
    @NotBlank(message = "Branch cannot be empty")
    private String Branch;*/



    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private LocalDateTime creation_date = LocalDateTime.now();

    @Size(max = 15, min = 3)
    @Column(nullable = false)
    @NotBlank(message = "username cannot be empty")
    private String username;

    @Size(max = 20, min = 8)
    @Column(nullable = false)
    @NotBlank(message = "Password  cannot be empty")
    private String password ;

    @Size(max = 20, min = 8)
    @Column(nullable = false)
    @NotBlank(message = "Password confirmation cannot be empty")
    private String conf_password;
}

