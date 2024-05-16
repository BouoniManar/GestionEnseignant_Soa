package com.example.projet_soa_departement.Model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@Entity
public class Absence {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "enseignant_id", nullable = false)
    private Enseignant enseignant;

    public void setDateAbsence(Date dateAbsence) {
        this.dateAbsence = dateAbsence;
    }

    @Temporal(TemporalType.DATE)
    private Date dateAbsence;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
