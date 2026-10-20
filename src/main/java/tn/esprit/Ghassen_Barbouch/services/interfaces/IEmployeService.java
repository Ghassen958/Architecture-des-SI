package tn.esprit.Ghassen_Barbouch.services.interfaces;

import tn.esprit.Ghassen_Barbouch.entities.Employe;
import java.util.List;

public interface IEmployeService {
    Employe ajouterEmploye(Employe employe);
    Employe updateEmploye(Employe employe);
    void deleteEmploye(int id);
    Employe getEmploye(int id);
    List<Employe> getAllEmployes();
}
