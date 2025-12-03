package org.example.models;

import org.example.exception.EmployeException;

import java.time.LocalDate;

public class Manutentionnaire extends Employe {
    protected int nbheur;

    public Manutentionnaire(String type, String nom, String prenom, int age,
                            LocalDate dateEntrer,int nbheur) throws EmployeException {
        super(type, nom, prenom, age, dateEntrer);
        if(nbheur<=0) throw new EmployeException("le nombre d'heur invalide");
        this.nbheur=nbheur;
    }

    @Override
    public double CalculateSalary() {
        return this.nbheur*60;
    }
}
