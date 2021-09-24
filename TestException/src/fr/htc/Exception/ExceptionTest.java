package fr.htc.Exception;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) throws InterruptedException {

		ExceptionTest et = new ExceptionTest();
		int somme = 0;
		try {
			  somme = et.ajouter(5, "10 ");
		} catch (Exception e) {
			System.out.println("operation impossible, les params sont incompatible\n" + e.toString());
			//e.printStackTrace();
		}
		System.out.println(somme);
		
		
		new Scanner(System.in).next();
	}

	/**
	 * 
	 * @param a
	 * @param str
	 * @return la somme de a et int(str) si str est au bon format; a sinon
	 */
	public int ajouter(int a, String str) throws NumberFormatException{
		int b = Integer.parseInt(str);
		a = a + b;
		return a;
	}



}
