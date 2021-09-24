package fr.htc.sujet.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.xml.crypto.dsig.TransformException;

import fr.htc.sujet.exceptions.InputUserWrongException;
import fr.htc.sujet.exceptions.WrongStateException;

public class InputService {

	/**
	 * 
	 * @return
	 * @throws InputUserWrongException
	 * @throws WrongStateException
	 */
	public int getInput() throws InputUserWrongException, WrongStateException  {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Entrez une valeur : ");
			int input = scanner.nextInt();
			if(input < 0) {
				throw new WrongStateException("Les nombres négatifs ne sont pas du tout tolérés");
			}
			return input;
		
		} catch (InputMismatchException e) {
			System.err.println("Error parsing user input !!!");
			throw new InputUserWrongException("Input must be  numeric");
		}finally {
			System.out.println("Je suis dans finally");
			scanner.close();
		}


	}

}
