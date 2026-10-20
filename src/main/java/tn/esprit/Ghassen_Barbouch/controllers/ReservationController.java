package tn.esprit.Ghassen_Barbouch.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.Ghassen_Barbouch.entities.Reservation;
import tn.esprit.Ghassen_Barbouch.services.interfaces.IReservationService;
import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/reservation")
public class ReservationController {
    private final IReservationService reservationService;
    @PostMapping("/ajouter") public Reservation ajouterReservation(@RequestBody Reservation reservation)
    { return reservationService.ajouterReservation(reservation); }

    @PutMapping("/modifier") public Reservation updateReservation(@RequestBody Reservation reservation)
    { return reservationService.updateReservation(reservation); }

    @DeleteMapping("/supprimer/{id}") public void deleteReservation(@PathVariable int id)
    { reservationService.deleteReservation(id); }

    @GetMapping("/get/{id}") public Reservation getReservation(@PathVariable int id)
    { return reservationService.getReservation(id); }

    @GetMapping("/getAll") public List<Reservation> getAllReservations()
    { return reservationService.getAllReservations(); }
}
