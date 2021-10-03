package fr.htc.genericite;

public class Triplet<T,T2> extends Couple<T> {
	
private T2 c ; 


	public T2 getC() {
	return c;
}
	public void setC(T2 c) {
	this.c = c;
}
	public Triplet(T a, T b, T2 c) {
		super(a, b);
		this.c = c;
	}




}
