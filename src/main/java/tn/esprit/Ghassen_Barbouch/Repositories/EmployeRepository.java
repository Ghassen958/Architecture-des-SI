package tn.esprit.Ghassen_Barbouch.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Ghassen_Barbouch.entities.Employe;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
