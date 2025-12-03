package org.example;

import org.example.models.Vendeur;
import org.example.models.ManutentionnaireARisque;
import org.example.models.TechnicienARisque;
import org.example.service.Entreprise;
import org.example.exception.EmployeException;
import java.time.LocalDate;
import org.example.models.Technicien;
import org.example.models.Represent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try {

            Entreprise e = new Entreprise("Oubir Industries",
                    LocalDate.of(2020, 3, 12), 10);
            e.AjouterEmploye(new Vendeur(
                    "Vendeur","Amine","Zaki",29,
                    LocalDate.of(2019,1,1),40000));
            e.AjouterEmploye(new Represent(
                    "Représentant","Yassir","Ali",31,
                    LocalDate.of(2018,5,10),65000));
            e.AjouterEmploye(new Technicien(
                    "Technicien","Brahim","Fahd",25,
                    LocalDate.of(2021,4,8),500));
            e.AjouterEmploye(new TechnicienARisque(
                    "Technicien ARisque","Samir","Haj",35,
                    LocalDate.of(2016,3,3),450));
            e.AjouterEmploye(new ManutentionnaireARisque(
                    "Manutentionnaire ARisque","Said","Mounir",41,
                    LocalDate.of(2015,7,15),130));

            e.afficher();
            e.calculerSalaires();
            System.out.println("Moyenne = " + e.salaireMoyen() + " DH\n");

        } catch (EmployeException ex) {
            System.err.println("\nErreur détectée : " + ex.getMessage());
        }
    }
}