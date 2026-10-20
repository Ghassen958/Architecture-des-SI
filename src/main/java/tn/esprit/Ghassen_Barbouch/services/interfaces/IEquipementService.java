package tn.esprit.Ghassen_Barbouch.services.interfaces;

import tn.esprit.Ghassen_Barbouch.entities.Equipement;
import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement equipement);
    Equipement updateEquipement(Equipement equipement);
    void deleteEquipement(int id);
    Equipement getEquipement(int id);
    List<Equipement> getAllEquipements();
}
