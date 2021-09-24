package fr.mlm.batchs.data;

public class Facture {
	
	public Facture(String ref, int seq) {
		super();
		this.ref = ref;
		this.seq = seq;
	}
	private String ref;
	private int seq;
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	
	
	

}
