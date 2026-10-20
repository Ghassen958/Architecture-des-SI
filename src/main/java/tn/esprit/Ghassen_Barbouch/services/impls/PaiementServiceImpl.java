package tn.esprit.Ghassen_Barbouch.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Ghassen_Barbouch.Repositories.PaiementRepository;
import tn.esprit.Ghassen_Barbouch.entities.Paiement;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IPaiementService;

import java.util.List;

@AllArgsConstructor
@Service
public class PaiementServiceImpl implements IPaiementService {

    private final PaiementRepository paiementRepository;

    @Override
    public Paiement ajouterPaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement updatePaiement(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public void deletePaiement(int id) {
        paiementRepository.deleteById((long) id);
    }

    @Override
    public Paiement getPaiement(int id) {
        return paiementRepository.findById((long) id).orElse(null);
    }

    @Override
    public List<Paiement> getAllPaiements() {
        return paiementRepository.findAll();
    }
}
