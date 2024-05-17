package com.example.projet_soa_departement.Service;

import com.example.projet_soa_departement.Model.CadreAdministratif;
import com.example.projet_soa_departement.Repository.CadreAdministratifRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CadreAdministratifService {

    @Autowired
    private CadreAdministratifRepository cadreAdministratifRepository;

    public CadreAdministratif getCadreAdministratif(Long id) {
        return cadreAdministratifRepository.findById(id).orElse(null);
    }

    public List<CadreAdministratif> getAllCadresAdministratifs() {
        return cadreAdministratifRepository.findAll();
    }

    public CadreAdministratif addCadreAdministratif(CadreAdministratif cadreAdministratif) {
        return cadreAdministratifRepository.save(cadreAdministratif);
    }

    public CadreAdministratif updateCadreAdministratif(Long id, CadreAdministratif cadreAdministratif) {
        cadreAdministratif.setId(id);
        return cadreAdministratifRepository.save(cadreAdministratif);
    }

    public void deleteCadreAdministratif(Long id) {
        cadreAdministratifRepository.deleteById(id);
    }
}