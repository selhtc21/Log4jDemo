package fr.htc.genericite;

public class Couple<T> {
private T a ; 
private T b ;

public T getA() {
	return a;
}
public void setA(T a) {
	this.a = a;
}
public T getB() {
	return b;
}
public void setB(T b) {
	this.b = b;
}
public Couple(T a, T b) {
	this.a = a;
	this.b = b;
} 


}
