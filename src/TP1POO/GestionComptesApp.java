package TP1POO;

public class GestionComptesApp {

	public static void main(String[] args) {
		Compte c1=new Compte(11111,"Ahmed",20000);
		Compte c2=new Compte(22222,"HAJAR",30000);
		c1.retirer(19000);
		c2.retirer(45000);
		c1.deposer(15000);
		System.out.println("Le compte de "+c1.getNomClient()+" est : "+c1.getSolde());
		System.out.println("Le compte de "+c2.getNomClient()+" est : "+c2.getSolde());
	}
}
