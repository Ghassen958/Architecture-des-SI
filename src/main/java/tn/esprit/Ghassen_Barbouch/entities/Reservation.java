package tn.esprit.Ghassen_Barbouch.entities;

import tn.esprit.Ghassen_Barbouch.enums.StatutReservation;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    @Enumerated(EnumType.STRING)
    private StatutReservation statut;

    @ManyToOne
    private Client client;
    @ManyToOne
    private Vehicule vehicule;
    @OneToOne(mappedBy = "reservation")
    private Contrat contrat;
}
