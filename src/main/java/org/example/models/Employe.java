package org.example.models;

import org.example.exception.EmployeException;

import java.time.LocalDate;

public abstract class Employe {
    protected String type;
    protected String nom;
    protected String prenom;
    protected int age;
    protected LocalDate dateEntrer;

    public  Employe(String type, String nom, String prenom, int age, LocalDate dateEntrer) throws EmployeException {
        if(nom==null || prenom==null) throw new EmployeException("nom ou prenom invalid");
        if(age<0 || age>100) throw new EmployeException("age invalid");
        if(dateEntrer==null || dateEntrer.isAfter(LocalDate.now())) throw new EmployeException("date invalid");
        this.type = type;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.dateEntrer = dateEntrer;
    }

    public abstract double CalculateSalary();

    public String getNom() {return nom;}
    public String getType() {return type;}
}
