package tn.esprit.Ghassen_Barbouch.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Ghassen_Barbouch.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
