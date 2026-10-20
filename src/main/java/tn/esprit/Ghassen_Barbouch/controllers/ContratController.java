package tn.esprit.Ghassen_Barbouch.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Ghassen_Barbouch.entities.Contrat;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IContratService;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/contrat")
public class ContratController {

    private final IContratService contratService;

    @PostMapping("/ajouter")
    public Contrat ajouterContrat(@RequestBody Contrat contrat) { return contratService.ajouterContrat(contrat); }

    @PutMapping("/modifier")
    public Contrat updateContrat(@RequestBody Contrat contrat) { return contratService.updateContrat(contrat); }

    @DeleteMapping("/supprimer/{id}")
    public void deleteContrat(@PathVariable int id) { contratService.deleteContrat(id); }

    @GetMapping("/get/{id}")
    public Contrat getContrat(@PathVariable int id) { return contratService.getContrat(id); }

    @GetMapping("/getAll")
    public List<Contrat> getAllContrats() { return contratService.getAllContrats(); }
}
