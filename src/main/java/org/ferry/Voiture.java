package org.ferry;

import java.util.ArrayList;
import java.util.List;

public class Voiture extends Vehicule{
    private int nombreDePassager;
    List<Voyageur> Passagers;

    public Voiture(String modele, String immatriculation, double kilometrage, double poidsVide, double longueur, double reserveCarburant, int nombreDePassager) {
        super(modele, immatriculation, kilometrage, poidsVide, longueur, reserveCarburant);
        this.nombreDePassager = nombreDePassager;
        Passagers = new ArrayList<>();
    }

    public void monter (Voyageur passager) {
        if (Passagers.size() < nombreDePassager) {
            Passagers.add(passager);
            System.out.println(passager + " A été ajouté dans la liste des passagers.");
        }
        else System.out.println("Tsy mapiditra tsonyyy");
    }

    public void descendre (Voyageur passager) {
        if (Passagers.contains(passager)) {
            Passagers.remove(passager);
            System.out.println("Nidina " + passager);
        }

        else System.out.println("Tsy ato lty " + passager);
    }

    public int getNombreDePassager() {
        return nombreDePassager;
    }

    public void setNombreDePassager(int nombreDePassager) {
        this.nombreDePassager = nombreDePassager;
    }
}
