package org.example.service;

import org.example.models.Employe;
import org.example.interfaces.Affichable;
import java.time.LocalDate;

public class Entreprise implements Affichable {
    private String nom;
    private LocalDate dateCreation;
    private Employe[] personnel;
    private int capacite;
    private int nbEmployes;

    public Entreprise(String nom, LocalDate dateCreation, int capacite) {
        this.nom = nom;
        this.dateCreation = dateCreation;
        this.capacite = capacite;
        this.personnel = new Employe[capacite];
        this.nbEmployes = 0;
    }
    public void AjouterEmploye(Employe e) {
        if (nbEmployes < capacite) {
            personnel[nbEmployes++] = e;
            System.out.println("Employé ajouté : " + e.getNom());
        } else {
            System.out.println("Capacité atteinte! Impossible d'ajouter.");
        }
    }
    public void calculerSalaires() {
        System.out.println("\nListe des salaires :\n");
        for (int i = 0; i < nbEmployes; i++) {
            System.out.println(personnel[i].getType() + " → " + personnel[i].getNom() +
                    " | Salaire = " + personnel[i].CalculateSalary() + " DH");
        }
    }
    public double salaireMoyen() {
        if (nbEmployes == 0) return 0;
        double total = 0;
        for (int i = 0; i < nbEmployes; i++)
            total += personnel[i].CalculateSalary();
        return total / nbEmployes;
    }
    public void trierParSalaire() {
        for (int i = 0; i < nbEmployes - 1; i++) {
            for (int j = 0; j < nbEmployes - i - 1; j++) {
                if (personnel[j].CalculateSalary() < personnel[j+1].CalculateSalary()) {
                    Employe temp = personnel[j];
                    personnel[j] = personnel[j+1];
                    personnel[j+1] = temp;
                }}}
        System.out.println("\nTri par salaire effectué avec succès.\n");
    }
    @Override
    public void afficher() {
        System.out.println("=== Informations de l'entreprise ===");
        System.out.println("Nom : " + nom);
        System.out.println("Date de création : " + dateCreation);
        System.out.println("Capacité : " + capacite);
        System.out.println("Nombre d'employés : " + nbEmployes);
        trierParSalaire();
        System.out.println("\n--- Personnel trié par salaire (descendant) ---");
        for (int i = 0; i < nbEmployes; i++) {
            Employe e = personnel[i];
            System.out.println(e.getType() + " – " + e.getNom() +
                    " | Salaire = " + e.CalculateSalary() + " DH");
        }}
}
