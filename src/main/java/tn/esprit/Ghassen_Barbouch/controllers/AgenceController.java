package tn.esprit.Ghassen_Barbouch.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.Ghassen_Barbouch.entities.Agence;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IAgenceService;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/agence")
public class AgenceController {

    private final IAgenceService agenceService;

    @PostMapping("/ajouter")
    public Agence ajouterAgence(@RequestBody Agence agence) {
        return agenceService.ajouterAgence(agence);
    }

    @PutMapping("/modifier")
    public Agence updateAgence(@RequestBody Agence agence) {
        return agenceService.updateAgence(agence);
    }

    @DeleteMapping("/supprimer/{id}")
    public void deleteAgence(@PathVariable int id) {
        agenceService.deleteAgence(id);
    }

    @GetMapping("/get/{id}")
    public Agence getAgence(@PathVariable int id) {
        return agenceService.getAgence(id);
    }

    @GetMapping("/getAll")
    public List<Agence> getAllAgences() {
        return agenceService.getAllAgences();
    }
}
