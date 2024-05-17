package com.example.projet_soa_departement.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@Entity
public class Enseignant {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String matiere;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
