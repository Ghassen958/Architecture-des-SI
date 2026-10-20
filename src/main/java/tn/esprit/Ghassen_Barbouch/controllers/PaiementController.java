package tn.esprit.Ghassen_Barbouch.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Ghassen_Barbouch.entities.Paiement;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IPaiementService;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/paiement")
public class PaiementController {

    private final IPaiementService paiementService;

    @PostMapping("/ajouter") public Paiement ajouterPaiement(@RequestBody Paiement paiement)
    { return paiementService.ajouterPaiement(paiement); }

    @PutMapping("/modifier") public Paiement updatePaiement(@RequestBody Paiement paiement)
    { return paiementService.updatePaiement(paiement); }

    @DeleteMapping("/supprimer/{id}") public void deletePaiement(@PathVariable int id)
    { paiementService.deletePaiement(id); }

    @GetMapping("/get/{id}") public Paiement getPaiement(@PathVariable int id)
    { return paiementService.getPaiement(id); }

    @GetMapping("/getAll") public List<Paiement> getAllPaiements()
    { return paiementService.getAllPaiements(); }
}
