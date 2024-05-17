package com.example.projet_soa_departement.Controller;

import com.example.projet_soa_departement.Model.CadreAdministratif;
import com.example.projet_soa_departement.Service.CadreAdministratifService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cadresadministratifs")
public class CadreAdministratifController {

    @Autowired
    private CadreAdministratifService cadreAdministratifService;

    @GetMapping("/{id}")
    public CadreAdministratif getCadreAdministratif(@PathVariable Long id) {
        return cadreAdministratifService.getCadreAdministratif(id);
    }

    @GetMapping("/list")
    public List<CadreAdministratif> getAllCadresAdministratifs() {
        return cadreAdministratifService.getAllCadresAdministratifs();
    }

    @PostMapping("/addCadre")
    public CadreAdministratif addCadreAdministratif(@RequestBody CadreAdministratif cadreAdministratif) {
        return cadreAdministratifService.addCadreAdministratif(cadreAdministratif);
    }

    @PutMapping("/updC/{id}")
    public CadreAdministratif updateCadreAdministratif(@PathVariable Long id, @RequestBody CadreAdministratif cadreAdministratif) {
        return cadreAdministratifService.updateCadreAdministratif(id, cadreAdministratif);
    }

    @DeleteMapping("/delC/{id}")
    public void deleteCadreAdministratif(@PathVariable Long id) {
        cadreAdministratifService.deleteCadreAdministratif(id);
    }
}