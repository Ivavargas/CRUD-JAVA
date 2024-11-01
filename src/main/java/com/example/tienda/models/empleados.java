package com.example.tienda.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Data
@Entity
@Table(name = "empleados")

public class empleados {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firsName;

    @Column
    private String LastName;

    @Column(name="email", unique = true,nullable = false)
    private String email;


}
