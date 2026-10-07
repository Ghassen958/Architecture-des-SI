package tn.esprit.Ghassen_Barbouch.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Ghassen_Barbouch.entities.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
