package com.example.projet_soa_departement.Controller;

import com.example.projet_soa_departement.Model.Enseignant;
import com.example.projet_soa_departement.Service.EnseignantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/enseignants")
public class EnseignantController {

    @Autowired
    private EnseignantService enseignantService;

    @GetMapping("/list/{id}")
    public Enseignant getEnseignant(@PathVariable int id) {

        return enseignantService.getEnseignant(id);
    }

    @GetMapping("/tous")
    public List<Enseignant> getAllEnseignants() {

        return enseignantService.getAllEnseignants();
    }

    @PostMapping("/add")
    public Enseignant addEnseignant(@RequestBody Enseignant enseignant) {
        return enseignantService.addEnseignant(enseignant);
    }

    @PutMapping("/update/{id}")
    public Enseignant updateEnseignant(@PathVariable int id, @RequestBody Enseignant enseignant) {
        return enseignantService.updateEnseignant(id, enseignant);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEnseignant(@PathVariable int id) {
        enseignantService.deleteEnseignant(id);
    }




}