package tn.esprit.Ghassen_Barbouch.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Ghassen_Barbouch.Repositories.AgenceRepository;
import tn.esprit.Ghassen_Barbouch.entities.Agence;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IAgenceService;

import java.util.List;

@AllArgsConstructor
@Service
public class AgenceServiceImpl implements IAgenceService {

    private final AgenceRepository agenceRepository;

    @Override
    public Agence ajouterAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence updateAgence(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void deleteAgence(int id) {
        agenceRepository.deleteById((long) id);
    }

    @Override
    public Agence getAgence(int id) {
        return agenceRepository.findById((long) id).orElse(null);
    }

    @Override
    public List<Agence> getAllAgences() {
        return agenceRepository.findAll();
    }
}
