package tn.esprit.Ghassen_Barbouch.services.interfaces;

import tn.esprit.Ghassen_Barbouch.entities.Reservation;
import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation reservation);
    Reservation updateReservation(Reservation reservation);
    void deleteReservation(int id);
    Reservation getReservation(int id);
    List<Reservation> getAllReservations();
}
