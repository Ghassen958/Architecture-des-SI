package tn.esprit.Ghassen_Barbouch.services.interfaces;

import tn.esprit.Ghassen_Barbouch.entities.Maintenance;
import java.util.List;

public interface IMaintenanceService {
    Maintenance ajouterMaintenance(Maintenance maintenance);
    Maintenance updateMaintenance(Maintenance maintenance);
    void deleteMaintenance(int id);
    Maintenance getMaintenance(int id);
    List<Maintenance> getAllMaintenances();
}
