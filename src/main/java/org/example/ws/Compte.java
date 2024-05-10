package org.example.ws;

import java.util.Date;

public class Compte {
    private String code;
    private double solde;

    private Date dateCreation;
    public Compte() {
    }

    public Compte(String code, double solde) {
        this.code = code;
        this.solde = solde;
    }

    public String getCode() {
        return code;
    }

    public double getSolde() {
        return solde;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void debiter(double montant) {
        solde -= montant;
    }

    public void crediter(double montant) {
        solde += montant;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "code='" + code + '\'' +
                ", solde=" + solde +
                '}';
    }
}
