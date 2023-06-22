package com.site.ecommerce.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "commentaire")
public class Commentaire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_commentaire")
    private int idCommentaire;

    @ManyToOne
    @JoinColumn(name = "id_user")
    private User user;

}
