package tn.esprit.Ghassen_Barbouch.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Ghassen_Barbouch.entities.Vehicule;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IVehiculeService;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/vehicule")
public class VehiculeController {

    private final IVehiculeService vehiculeService;

    @PostMapping("/ajouter") public Vehicule ajouterVehicule(@RequestBody Vehicule vehicule)
    { return vehiculeService.ajouterVehicule(vehicule); }

    @PutMapping("/modifier") public Vehicule updateVehicule(@RequestBody Vehicule vehicule)
    { return vehiculeService.updateVehicule(vehicule); }

    @DeleteMapping("/supprimer/{id}") public void deleteVehicule(@PathVariable int id)
    { vehiculeService.deleteVehicule(id); }

    @GetMapping("/get/{id}") public Vehicule getVehicule(@PathVariable int id)
    { return vehiculeService.getVehicule(id); }

    @GetMapping("/getAll") public List<Vehicule> getAllVehicules()
    { return vehiculeService.getAllVehicules(); }
}
