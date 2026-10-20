package tn.esprit.Ghassen_Barbouch.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Ghassen_Barbouch.entities.Maintenance;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IMaintenanceService;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/maintenance")
public class MaintenanceController {

    private final IMaintenanceService maintenanceService;

    @PostMapping("/ajouter") public Maintenance ajouterMaintenance(@RequestBody Maintenance maintenance)
    { return maintenanceService.ajouterMaintenance(maintenance); }

    @PutMapping("/modifier") public Maintenance updateMaintenance(@RequestBody Maintenance maintenance)
    { return maintenanceService.updateMaintenance(maintenance); }

    @DeleteMapping("/supprimer/{id}") public void deleteMaintenance(@PathVariable int id)
    { maintenanceService.deleteMaintenance(id); }

    @GetMapping("/get/{id}") public Maintenance getMaintenance(@PathVariable int id)
    { return maintenanceService.getMaintenance(id); }

    @GetMapping("/getAll") public List<Maintenance> getAllMaintenances()
    { return maintenanceService.getAllMaintenances(); }
}
