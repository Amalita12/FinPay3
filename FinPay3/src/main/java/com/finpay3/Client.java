package com.finpay3;

public class Client {
    private int idClient;
    private String nom;

    public Client(int idClient, String nom) {
        this.idClient = idClient;
        this.nom = nom;
    }

    public int getIdClient() {
        return this.idClient;
    }

    public String getNom() {
        return this.nom;
    }

    public String toString() {
        return "Client{id=" + this.idClient + ", nom='" + this.nom + "'}";
    }
}

