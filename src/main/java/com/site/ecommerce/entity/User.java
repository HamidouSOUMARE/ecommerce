package com.site.ecommerce.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.EnumType;
import jakarta.validation.constraints.Email;
import java.util.List;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Table(name = "utilisateur")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_user")
    private int idUser;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "date_Naissance")
    private String dateNaissance;

    @Enumerated(EnumType.STRING)
    @Column(name = "id_Profil")
    private Profil idProfil;

    @Email(message = "Invalid email address")
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "telephone")
    private String telephone;

    @OneToMany(mappedBy = "user")
    private List<Adresse> adresse;

    @OneToMany(mappedBy = "user")
    private List<Commande> commandes;

    @OneToMany(mappedBy = "user")
    private List<CartePaiement> cartesPaiement;

    @OneToMany(mappedBy = "user")
    private List<Commentaire> commentaires;

    public User() {
    }

    public User(int idUser, String nom, String prenom, String dateNaissance, Profil idProfil, String email,
            String password,
            String telephone, List<Adresse> adresse, List<Commande> commandes, List<CartePaiement> cartesPaiement,
            List<Commentaire> commentaires) {
        super();
        this.idUser = idUser;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.idProfil = idProfil;
        this.email = email;
        this.password = password;
        this.telephone = telephone;
        this.adresse = adresse;
        this.commandes = commandes;
        this.cartesPaiement = cartesPaiement;
        this.commentaires = commentaires;
    }

}