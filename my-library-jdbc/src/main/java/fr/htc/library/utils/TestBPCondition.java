package fr.htc.library.utils;

public class TestBPCondition {
	
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 50000; i++) {
			double x = Math.pow(Double.valueOf(""+i), 2d);
			
			String output = "_" + x + "||";
			
			System.out.println(output);
		}
		
	}

}
