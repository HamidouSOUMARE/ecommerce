package com.site.ecommerce.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "adresse")
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adresse")
    private int idAdresse;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    // Getters and setters, constructors, and other methods

}
