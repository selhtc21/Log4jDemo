package fr.htc.collections;

public class TestEquals {
	
	public static void main(String[] args) {
		
		User u1 = new User("dmouchene1", "PasseMouchene ");
		User u2 = new User("dmouchene1", "PasseMouchene ");
		
		if(u1.equals(u2)){
			System.out.println("u1 == u2 donne : " + true);
		} else {
			System.out.println("u1 == u2 donne : " + false);
		}
		
	}

}
