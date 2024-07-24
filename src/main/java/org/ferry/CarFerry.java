package org.ferry;

import java.util.ArrayList;
import java.util.List;

public class CarFerry extends Vehicule{
    private List<Vehicule> Embarquement;

    public CarFerry(String modele, String immatriculation, double kilometrage, double poidsVide, double longueur, double reserveCarburant) {
        super(modele, immatriculation, kilometrage, poidsVide, longueur, reserveCarburant);
        this.Embarquement = new ArrayList<>();
    }

    public void embarquer (Vehicule vehicule) {
        if (vehicule instanceof Voiture || vehicule instanceof Camion) {
            Embarquement.add(vehicule);
            System.out.println("Voaray");
        }
        else System.out.println("Tsy vehicule");
    }

    public void debarquer (Vehicule vehicule) {
        if (Embarquement.contains(vehicule)) {
            Embarquement.remove(vehicule);
            System.out.println("Tafidina");
        }
        else System.out.println("Tsisy " + vehicule + "zany ato ral ah");
    }

    public boolean chercherVoyageur (Voyageur personne) {
        for (Vehicule vehicule : Embarquement) {
            if (vehicule instanceof Voiture) {
                if(((Voiture) vehicule).Passagers.contains(personne)) return true;
                if (((Voiture) vehicule).getConducteur().equals(personne)) return true;
            }
            if (vehicule instanceof Camion) {
                if (((Camion) vehicule).getConducteur().equals(personne)) return true;
            }
        }
        return false;
    }
}
