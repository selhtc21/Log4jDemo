package fr.htc.sujet;

import java.io.FileNotFoundException;
import java.io.FileReader;

import fr.htc.sujet.exceptions.InputUserWrongException;
import fr.htc.sujet.exceptions.WrongStateException;
import fr.htc.sujet.utils.InputService;

public class Main {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		InputService inputService = new InputService();
		int val = 0;
		try {
			 val = inputService.getInput();
		} 
		catch (WrongStateException e) {
			e.printStackTrace();
		}
		catch (InputUserWrongException e) {
			e.printStackTrace();
		} 
		System.out.println("Input = " + val);
		System.out.println("fin Normal du programme !!!");

	}

}
