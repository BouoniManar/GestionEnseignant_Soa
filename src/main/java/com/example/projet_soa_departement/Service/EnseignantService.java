package com.example.projet_soa_departement.Service;

import com.example.projet_soa_departement.Model.Enseignant;
import com.example.projet_soa_departement.Repository.EnseignantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnseignantService {

    @Autowired
    private EnseignantRepository enseignantRepository;



    public Enseignant getEnseignant(int id) {

        return enseignantRepository.findById(id).orElse(null);
    }

    public List<Enseignant> getAllEnseignants() {

        return enseignantRepository.findAll();
    }

    public Enseignant addEnseignant(Enseignant enseignant) {

        return enseignantRepository.save(enseignant);
    }

    public Enseignant updateEnseignant(int id, Enseignant enseignant) {
        enseignant.setId((long) id);
        return enseignantRepository.save(enseignant);
    }

    public void deleteEnseignant(int id) {

        enseignantRepository.deleteById(id);
    }

}






