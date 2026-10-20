package tn.esprit.Ghassen_Barbouch.services.impls;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.Ghassen_Barbouch.Repositories.ReservationRepository;
import tn.esprit.Ghassen_Barbouch.entities.Reservation;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IReservationService;

import java.util.List;

@AllArgsConstructor
@Service
public class ReservationServiceImpl implements IReservationService {

    private final ReservationRepository reservationRepository;

    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(int id) {
        reservationRepository.deleteById((long) id);
    }

    @Override
    public Reservation getReservation(int id) {
        return reservationRepository.findById((long) id).orElse(null);
    }

    @Override
    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }
}
