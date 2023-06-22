package com.site.ecommerce.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cartePaiement")
public class CartePaiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_carte_paiement")
    private int idCartePaiement;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    // Getters and setters, constructors, and other methods

}