package tn.esprit.Ghassen_Barbouch.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Ghassen_Barbouch.Repositories.ContratRepository;
import tn.esprit.Ghassen_Barbouch.entities.Contrat;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IContratService;

import java.util.List;

@AllArgsConstructor
@Service
public class ContratServiceImpl implements IContratService {

    private final ContratRepository contratRepository;

    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat updateContrat(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void deleteContrat(int id) {
        contratRepository.deleteById((long) id);
    }

    @Override
    public Contrat getContrat(int id) {
        return contratRepository.findById((long) id).orElse(null);
    }

    @Override
    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }
}
