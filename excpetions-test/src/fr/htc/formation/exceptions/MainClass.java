package fr.htc.formation.exceptions;

public class MainClass {

	public static void main(String[] args)  {

			try {
				testExcptions();
			} catch (MyCheckedException e) {
				e.printStackTrace();
			} catch (MyRuntimeException e) {
				e.printStackTrace();
			}catch (Error e) {
				e.printStackTrace();
			}
			
			
			
			System.out.println("holla");

	}

	public static void testExcptions() throws MyCheckedException  {
		int a = 1;
		int b = 1;
		int c = 1;
		int d = 0;

		if (a == 0) {
			throw new MyCheckedException("A == 0 : Excpetion checked");
		}
		if (b == 0) {
			throw new MyRuntimeException("B == 0 : Runtime Excpetion unckecked");
		}
		if (c == 0) {
			throw new MyError("c == 0 : Error unchecked");
		}
		if (d == 0) {
			throw new Error("d == 0 : Error unchecked");
		}

	}

}
