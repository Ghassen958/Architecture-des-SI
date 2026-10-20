package tn.esprit.Ghassen_Barbouch.services.interfaces;

import tn.esprit.Ghassen_Barbouch.entities.Vehicule;
import java.util.List;

public interface IVehiculeService {
    Vehicule ajouterVehicule(Vehicule vehicule);
    Vehicule updateVehicule(Vehicule vehicule);
    void deleteVehicule(int id);
    Vehicule getVehicule(int id);
    List<Vehicule> getAllVehicules();
}
