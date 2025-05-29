package com.m2i;

public class Main {
    public static void main(String[] args) {
        // Référence au constructeur de CompteClient
        TriFunction<String, TypeCompte, Double, CompteClient> createurCompte = CompteClient::new;

        // Création d’un compte client
        CompteClient compte = createurCompte.apply("Alice Dupont", TypeCompte.EPARGNE, 1500.0);

        // Affichage
        System.out.println(compte);
    }
}

