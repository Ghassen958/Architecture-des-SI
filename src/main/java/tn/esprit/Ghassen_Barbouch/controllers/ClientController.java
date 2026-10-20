package tn.esprit.Ghassen_Barbouch.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Ghassen_Barbouch.entities.Client;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IClientService;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/client")
public class ClientController {

    private final IClientService clientService;

    @PostMapping("/ajouter")
        public Client ajouterClient(@RequestBody Client client) { return clientService.ajouterClient(client); }

    @PutMapping("/modifier")
        public Client updateClient(@RequestBody Client client) { return clientService.updateClient(client); }

    @DeleteMapping("/supprimer/{id}")
        public void deleteClient(@PathVariable int id) { clientService.deleteClient(id); }

    @GetMapping("/get/{id}")
        public Client getClient(@PathVariable int id) { return clientService.getClient(id); }

    @GetMapping("/getAll")
        public List<Client> getAllClients() { return clientService.getAllClients(); }
}
