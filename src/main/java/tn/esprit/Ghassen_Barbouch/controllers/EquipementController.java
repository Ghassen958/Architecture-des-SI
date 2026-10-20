package tn.esprit.Ghassen_Barbouch.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Ghassen_Barbouch.entities.Equipement;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IEquipementService;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/equipement")
public class EquipementController {

    private final IEquipementService equipementService;

    @PostMapping("/ajouter") public Equipement ajouterEquipement(@RequestBody Equipement equipement)
    { return equipementService.ajouterEquipement(equipement); }

    @PutMapping("/modifier") public Equipement updateEquipement(@RequestBody Equipement equipement)
    { return equipementService.updateEquipement(equipement); }

    @DeleteMapping("/supprimer/{id}") public void deleteEquipement(@PathVariable int id)
    { equipementService.deleteEquipement(id); }

    @GetMapping("/get/{id}") public Equipement getEquipement(@PathVariable int id)
    { return equipementService.getEquipement(id); }

    @GetMapping("/getAll") public List<Equipement> getAllEquipements()
    { return equipementService.getAllEquipements(); }
}
