package org.example.models;

import org.example.exception.EmployeException;
import org.example.interfaces.ARisque;

import java.time.LocalDate;

public class TechnicienARisque extends Technicien implements ARisque {

    public TechnicienARisque(String type, String nom, String prenom, int age,
                             LocalDate dateEntrer, int nbpro) throws EmployeException {
        super(type, nom, prenom, age, dateEntrer, nbpro);
    }

    @Override
    public double CalculateSalary() {
        return super.CalculateSalary() + prime;
    }
}
