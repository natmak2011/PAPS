package com.paps.paps.domains;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity(name = "request")
@Data

public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long request_id;

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
    @NotBlank(message = "Phone number cannot be empty")
    private String phone_number;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Email address cannot be empty")
    private String email_address;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Passport number cannot be empty")
    private String passport_number;

 /*   @Column(nullable = false, unique = true)
    @NotBlank(message = "Passport scan must be attached")
    private Blob scanned_passport;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Photo scan must be attached")
    private Blob upload_photo;

    @Column(nullable = false, unique = true)
    @NotBlank(message = "Id scan must be attached")
    private Blob upload_id_photo;*/

    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private LocalDateTime creation_date = LocalDateTime.now();
}
