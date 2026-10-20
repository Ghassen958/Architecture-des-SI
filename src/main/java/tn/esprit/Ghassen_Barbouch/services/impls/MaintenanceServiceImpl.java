package tn.esprit.Ghassen_Barbouch.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Ghassen_Barbouch.Repositories.MaintenanceRepository;
import tn.esprit.Ghassen_Barbouch.entities.Maintenance;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IMaintenanceService;

import java.util.List;

@AllArgsConstructor
@Service
public class MaintenanceServiceImpl implements IMaintenanceService {

    private final MaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance ajouterMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance updateMaintenance(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void deleteMaintenance(int id) {
        maintenanceRepository.deleteById((long) id);
    }

    @Override
    public Maintenance getMaintenance(int id) {
        return maintenanceRepository.findById((long) id).orElse(null);
    }

    @Override
    public List<Maintenance> getAllMaintenances() {
        return maintenanceRepository.findAll();
    }
}
