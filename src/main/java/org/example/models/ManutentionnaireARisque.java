package org.example.models;

import org.example.exception.EmployeException;
import org.example.interfaces.ARisque;

import java.time.LocalDate;

public class ManutentionnaireARisque extends Manutentionnaire implements ARisque {

    public ManutentionnaireARisque(String type, String nom, String prenom, int age,
                                   LocalDate dateEntrer, int nbheur) throws EmployeException {
        super(type, nom, prenom, age, dateEntrer, nbheur);
    }

    @Override
    public double CalculateSalary() {
        return super.CalculateSalary() + prime;
    }
}
