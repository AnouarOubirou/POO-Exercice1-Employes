package org.example.models;

import org.example.exception.EmployeException;

import java.time.LocalDate;

public class Technicien extends Employe {
    protected int nbpro;

    public Technicien(String type, String nom, String prenom, int age,
                      LocalDate dateEntrer,int nbpro) throws EmployeException {
        super(type, nom, prenom, age, dateEntrer);
        if(nbpro<0) throw new EmployeException("le nombre d'unites produit invalide");
        this.nbpro=nbpro;
    }

    @Override
    public double CalculateSalary() {
        return this.nbpro*5;
    }
}
