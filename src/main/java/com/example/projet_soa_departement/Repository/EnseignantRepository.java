package com.example.projet_soa_departement.Repository;

import com.example.projet_soa_departement.Model.Enseignant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnseignantRepository  extends JpaRepository<Enseignant, Integer> {
}
