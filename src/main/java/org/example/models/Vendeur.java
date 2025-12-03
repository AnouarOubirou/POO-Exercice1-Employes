package org.example.models;

import org.example.exception.EmployeException;

import java.time.LocalDate;

public class Vendeur extends Employe {
    protected double chiffre;

    public Vendeur(String type, String nom, String prenom, int age,
                   LocalDate dateEntrer,double chiffre) throws EmployeException {
        super(type, nom, prenom, age, dateEntrer);
        if(chiffre<0) throw new EmployeException("chiffre invalid");
        this.chiffre = chiffre;
    }
    @Override
    public double CalculateSalary() {
        return 0.2*this.chiffre+4000;
    }

}
