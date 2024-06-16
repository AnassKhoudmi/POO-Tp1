package TP1POO;

public class Compte {
	private long num;
	private String nomClient;
	private double solde;
	public Compte() {
		super();
	}
	public Compte(long num, String nomClient, double solde) {
		super();
		this.num = num;
		this.nomClient = nomClient;
		this.solde = solde;
	}
	public void afficherCompteInfo() {
		System.out.println("Le numero de ce compte est "+num+" appartenant a "+nomClient+" ayant un solde de "+solde);
	}
	public void retirer(double montant) {
		if(solde>=montant) 
			solde-=montant;
		else
			System.out.println("Votre solde est insuffisant.");	
	}
	public void deposer(double montant) {
		solde+=montant;
	}
	public long getNum() {
		return num;
	}
	public void setNum(long num) {
		this.num = num;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	
	

}
