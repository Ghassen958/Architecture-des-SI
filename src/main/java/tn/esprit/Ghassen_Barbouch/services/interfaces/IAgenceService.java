package tn.esprit.Ghassen_Barbouch.services.interfaces;

import tn.esprit.Ghassen_Barbouch.entities.Agence;

import java.util.List;

public interface IAgenceService {
    Agence ajouterAgence(Agence agence);
    Agence updateAgence(Agence agence);
    void deleteAgence(int id);
    Agence getAgence(int id);
    List<Agence> getAllAgences();
}
