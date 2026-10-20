package tn.esprit.Ghassen_Barbouch.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Ghassen_Barbouch.entities.Employe;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IEmployeService;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/employe")
public class EmployeController {

    private final IEmployeService employeService;

    @PostMapping("/ajouter") public Employe ajouterEmploye(@RequestBody Employe employe)
    { return employeService.ajouterEmploye(employe); }

    @PutMapping("/modifier") public Employe updateEmploye(@RequestBody Employe employe)
    { return employeService.updateEmploye(employe); }

    @DeleteMapping("/supprimer/{id}") public void deleteEmploye(@PathVariable int id)
    { employeService.deleteEmploye(id); }

    @GetMapping("/get/{id}") public Employe getEmploye(@PathVariable int id)
    { return employeService.getEmploye(id); }

    @GetMapping("/getAll") public List<Employe> getAllEmployes()
    { return employeService.getAllEmployes(); }
}
