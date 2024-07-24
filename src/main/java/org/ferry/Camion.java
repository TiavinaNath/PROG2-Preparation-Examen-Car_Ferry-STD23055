package org.ferry;

import java.util.ArrayList;
import java.util.List;

public class Camion extends Vehicule{
    private List<Colis> Cargaison;

    public Camion(String modele, String immatriculation, double kilometrage, double poidsVide, double longueur, double reserveCarburant) {
        super(modele, immatriculation, kilometrage, poidsVide, longueur, reserveCarburant);
        this.Cargaison = new ArrayList<>();
    }

    public void ajouterColis (Colis colis) {
        Cargaison.add(colis);
    }

    public void retirerColis (Colis colis) {
        Cargaison.remove(colis);
    }
}
