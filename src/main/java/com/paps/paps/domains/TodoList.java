package com.paps.paps.domains;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity(name = "Todo-List")
@Data
public class TodoList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Todo_id;

    //@Size(max = 15, min = 3)
    @Column(nullable = false)
    @NotBlank(message = "Cannot be empty")
    private String Sent_By;

    @Column(nullable = false)
    @NotBlank(message = "Cannot be empty")
    private Long user_id;

    @Column(nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    @CreationTimestamp
    private LocalDateTime action_date = LocalDateTime.now();


    @Column(nullable = false)
    @NotBlank(message = "Action cannot be empty")
    private String Action_Required;


    @Column(nullable = false)
    @NotBlank(message = "status  cannot be empty")
    private String status ;


}
