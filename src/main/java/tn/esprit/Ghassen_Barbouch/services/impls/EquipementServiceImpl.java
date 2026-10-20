package tn.esprit.Ghassen_Barbouch.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Ghassen_Barbouch.Repositories.EquipementRepository;
import tn.esprit.Ghassen_Barbouch.entities.Equipement;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IEquipementService;

import java.util.List;

@AllArgsConstructor
@Service
public class EquipementServiceImpl implements IEquipementService {

    private final EquipementRepository equipementRepository;

    @Override
    public Equipement ajouterEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement updateEquipement(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public void deleteEquipement(int id) {
        equipementRepository.deleteById((long) id);
    }

    @Override
    public Equipement getEquipement(int id) {
        return equipementRepository.findById((long) id).orElse(null);
    }

    @Override
    public List<Equipement> getAllEquipements() {
        return equipementRepository.findAll();
    }
}
