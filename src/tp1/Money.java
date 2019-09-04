package tp1;

public class Money {
	
	private int montant;
	private String devise;
	
	public Money(int mon, String dev) {
		this.montant= mon;
		this.devise= dev;
	}
	
	public int getMontant() {
		return this.montant;
	}
	
	public String getDevise() {
		return this.devise;
	}
	
	public Money add(Money m) {
		return new Money(this.getMontant()+m.getMontant(), this.getDevise());
	}
	
	/**
	 * @param ob Money a comparer
	 * @return si le montant et la devise est egale
	 * 
	 * compare deux objets Money
	 */
	public boolean equals(Object ob) {
		if(ob != null && ob.getClass() == getClass())
			if(((Money)ob).montant == this.montant && ((Money)ob).devise == this.devise)
				return true;
		return false;
	}
	
	public String toString() {
		return "Montant: " + montant + "\nDevise: " + devise;
	}
}
