package com.m2i;

public class CompteClient {
    private String nomClient;
    private TypeCompte typeCompte;
    private double soldeInitial;
    
	public CompteClient(String nomClient, TypeCompte typeCompte, double soldeInitial) {
		this.nomClient = nomClient;
		this.typeCompte = typeCompte;
		this.soldeInitial = soldeInitial;
	}

	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public TypeCompte getTypeCompte() {
		return typeCompte;
	}
	public void setTypeCompte(TypeCompte typeCompte) {
		this.typeCompte = typeCompte;
	}
	public double getSoldeInitial() {
		return soldeInitial;
	}
	public void setSoldeInitial(double soldeInitial) {
		this.soldeInitial = soldeInitial;
	}

	@Override
	public String toString() {
		return "CompteClient [nomClient=" + nomClient + ", typeCompte=" + typeCompte + ", soldeInitial=" + soldeInitial
				+ "]";
	}
}

