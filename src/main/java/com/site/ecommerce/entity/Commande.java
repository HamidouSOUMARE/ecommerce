package com.site.ecommerce.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "commande")
public class Commande {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_commande")
    private int idCommande;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

    // Getters and setters, constructors, and other methods

}