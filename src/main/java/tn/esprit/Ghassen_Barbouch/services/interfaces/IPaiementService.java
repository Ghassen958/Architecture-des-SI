package tn.esprit.Ghassen_Barbouch.services.interfaces;

import tn.esprit.Ghassen_Barbouch.entities.Paiement;
import java.util.List;

public interface IPaiementService {
    Paiement ajouterPaiement(Paiement paiement);
    Paiement updatePaiement(Paiement paiement);
    void deletePaiement(int id);
    Paiement getPaiement(int id);
    List<Paiement> getAllPaiements();
}
