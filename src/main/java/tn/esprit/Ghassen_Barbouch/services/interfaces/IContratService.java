package tn.esprit.Ghassen_Barbouch.services.interfaces;

import tn.esprit.Ghassen_Barbouch.entities.Contrat;
import java.util.List;

public interface IContratService {
    Contrat ajouterContrat(Contrat contrat);
    Contrat updateContrat(Contrat contrat);
    void deleteContrat(int id);
    Contrat getContrat(int id);
    List<Contrat> getAllContrats();
}
