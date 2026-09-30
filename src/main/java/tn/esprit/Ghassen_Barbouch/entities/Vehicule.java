package tn.esprit.Ghassen_Barbouch.entities;

import tn.esprit.Ghassen_Barbouch.enums.CategorieVehicule;
import tn.esprit.Ghassen_Barbouch.enums.StatutVehicule;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;

    private String immatriculation;
    private String marque;
    private String modele;

    @Enumerated(EnumType.STRING)
    private CategorieVehicule categorie;

    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    private StatutVehicule statut;

    @ManyToOne
    private Agence agence;
    @ManyToMany
    private Set<Equipement> equipements;
    @OneToMany(mappedBy = "vehicule")
    private Set<Reservation> reservations;
}
