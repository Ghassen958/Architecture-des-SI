package tn.esprit.Ghassen_Barbouch.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Ghassen_Barbouch.Repositories.ClientRepository;
import tn.esprit.Ghassen_Barbouch.entities.Client;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IClientService;

import java.util.List;

@AllArgsConstructor
@Service
public class ClientServiceImpl implements IClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client ajouterClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(int id) {
        clientRepository.deleteById((long) id);
    }

    @Override
    public Client getClient(int id) {
        return clientRepository.findById((long) id).orElse(null);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
