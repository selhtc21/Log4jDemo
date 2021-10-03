package fr.htc.tools.types;

public class MoyenneEcartType implements Operation {

	@Override
	public void process(String title) {
		// TODO Auto-generated method stub
		System.out.println("Je suis dans le choix : " + title);
		System.out.print("Entrer la taille du tableau : ");

		int j = scanner.nextInt();
		int somme = 0;
		double sigma, entreSquar= 0, moyenne ;

		int tableau[] = new int[j];
		
		System.out.println("entrer les " + j + " �l�ments du tableau");
		for (int i = 0; i < tableau.length; i++) {
			tableau[i] = scanner.nextInt();
			somme = somme + tableau[i];
			entreSquar = entreSquar + Math.pow(tableau[i], 2);

		}
		moyenne = somme / tableau.length ;
		sigma = Math.sqrt((entreSquar / tableau.length) - Math.pow(moyenne, 2));
		System.out.println("La moyenne des valeurs entr�es est = " + moyenne);
		System.out.println("L'�cart type des valeurs entr�es est = " + sigma);
	}

}
