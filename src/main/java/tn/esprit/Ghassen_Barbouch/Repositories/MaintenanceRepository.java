package tn.esprit.Ghassen_Barbouch.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Ghassen_Barbouch.entities.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
}
