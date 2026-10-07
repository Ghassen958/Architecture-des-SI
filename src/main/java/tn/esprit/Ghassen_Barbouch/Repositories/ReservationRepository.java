package tn.esprit.Ghassen_Barbouch.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.Ghassen_Barbouch.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
