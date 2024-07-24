package org.ferry;

import java.time.LocalDate;

public class Voyageur extends Personne {
    private LocalDate dateDeVoyage;

    public Voyageur(String nom, String prenom, LocalDate dateDeNaissance, String adresse, double poids, LocalDate dateDeVoyage) {
        super(nom, prenom, dateDeNaissance, adresse, poids);
        this.dateDeVoyage = dateDeVoyage;
    }

    public LocalDate getDateDeVoyage() {
        return dateDeVoyage;
    }

    public void setDateDeVoyage(LocalDate dateDeVoyage) {
        this.dateDeVoyage = dateDeVoyage;
    }


    @Override
    public void voyager() {
        System.out.println("Michaufera anhh");
    }
}
