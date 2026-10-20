package tn.esprit.Ghassen_Barbouch.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Ghassen_Barbouch.Repositories.VehiculeRepository;
import tn.esprit.Ghassen_Barbouch.entities.Vehicule;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IVehiculeService;

import java.util.List;

@AllArgsConstructor
@Service
public class VehiculeServiceImpl implements IVehiculeService {

    private final VehiculeRepository vehiculeRepository;

    @Override
    public Vehicule ajouterVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule updateVehicule(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteVehicule(int id) {
        vehiculeRepository.deleteById((long) id);
    }

    @Override
    public Vehicule getVehicule(int id) {
        return vehiculeRepository.findById((long) id).orElse(null);
    }

    @Override
    public List<Vehicule> getAllVehicules() {
        return vehiculeRepository.findAll();
    }
}
