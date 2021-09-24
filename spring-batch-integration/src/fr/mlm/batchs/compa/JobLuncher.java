package fr.mlm.batchs.compa;

import java.util.ArrayList;
import java.util.List;

import fr.mlm.batchs.data.Facture;

public class JobLuncher {

	public static void main(String[] args) {
		List<Facture> factures = new ArrayList<Facture>();
		for (int i = 0; i < 100; i++) {
			Facture fact = new Facture("F022020" + i, i);
			factures.add(fact);
			
		}
		
		
		for (Facture facture : factures) {
			System.out.println("La facture N°" + facture.getRef() + " est enregistré sous la sequence " + facture.getSeq());
			
			
		}
		
		

	}

}
