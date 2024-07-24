package org.ferry;

import java.time.LocalDate;

public class Vehicule {
    private String modele;
    private String immatriculation;
    private double kilometrage;
    private double poidsVide;
    private double longueur;
    private double reserveCarburant;
    private Conducteur conducteur;


    public Vehicule(String modele, String immatriculation, double kilometrage, double poidsVide, double longueur, double reserveCarburant) {
        this.modele = modele;
        this.immatriculation = immatriculation;
        this.kilometrage = kilometrage;
        this.poidsVide = poidsVide;
        this.longueur = longueur;
        this.reserveCarburant = reserveCarburant;
        this.conducteur = null;
    }

    public void changerConducteur(Conducteur conducteur) {;
        if(LocalDate.now().getYear() - conducteur.getDateDeNaissance().getYear() < 18){
            System.out.println("Tsy mety");
        }
        else this.conducteur = conducteur;
    }

    public double getpoids (double autreCharge) {
        return this.poidsVide + this.reserveCarburant + autreCharge;
    }

    public void allerALaPompe (double quantiteAAjouter) {
        this.reserveCarburant += quantiteAAjouter;
        System.out.println(quantiteAAjouter + "Litres de carburant ajoutés. Carburant actuel: " + this.reserveCarburant);
    }

    public void rouler (double distanceAParcourir, double tauxDeConsommation) {
        if (this.conducteur == null) {
            System.out.println("Le véhicule n'a pas de conducteur");
            return;
        }
        if (this.reserveCarburant < distanceAParcourir*(tauxDeConsommation/100)) {
            System.out.println("La quantité de carburant disponible n’est pas suffisante pour cette opération");
            return;
        }
        System.out.println("Vous roulez");
        this.kilometrage += distanceAParcourir;
        this.reserveCarburant -= distanceAParcourir*(tauxDeConsommation/100);
    }

    public Conducteur getConducteur() {
        return conducteur;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public double getKilometrage() {
        return kilometrage;
    }

    public void setKilometrage(double kilometrage) {
        this.kilometrage = kilometrage;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public double getPoidsVide() {
        return poidsVide;
    }

    public void setPoidsVide(double poidsVide) {
        this.poidsVide = poidsVide;
    }

    public double getReserveCarburant() {
        return reserveCarburant;
    }

    public void setReserveCarburant(double reserveCarburant) {
        this.reserveCarburant = reserveCarburant;
    }
}
