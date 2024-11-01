package com.example.tienda.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="clientes")

public class clientes {
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
