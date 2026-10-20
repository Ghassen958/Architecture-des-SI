package tn.esprit.Ghassen_Barbouch.services.interfaces;

import tn.esprit.Ghassen_Barbouch.entities.Client;
import java.util.List;

public interface IClientService {
    Client ajouterClient(Client client);
    Client updateClient(Client client);
    void deleteClient(int id);
    Client getClient(int id);
    List<Client> getAllClients();
}
