package org.ferry;

import java.time.LocalDate;

public class Conducteur extends Personne {
    private int numeroDePermis;

    public Conducteur(String nom, String prenom, LocalDate dateDeNaissance, String adresse, double poids, int numeroDePermis) {
        super(nom, prenom, dateDeNaissance, adresse, poids);
        this.numeroDePermis = numeroDePermis;
    }

    public int getNumeroDePermis() {
        return numeroDePermis;
    }

    public void setNumeroDePermis(int numeroDePermis) {
        this.numeroDePermis = numeroDePermis;
    }

    @Override
    public void voyager () {
        System.out.println("Mivoyage anhh");
    }
}
