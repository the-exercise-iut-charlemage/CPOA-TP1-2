package tp1;

/**
 *class permettant de representer une monnaie
 */
public class Money {
	
	private int montant;
	private String devise;
	
	/**
	 * 
	 * @param mon le montant a ajouter
	 * @param dev la devise de la monnaie
	 */
	public Money(int mon, String dev) {
		this.montant= mon;
		this.devise= dev;
	}
	
	/**
	 * @return le montant
	 */
	public int getMontant() {
		return this.montant;
	}
	
	/**
	 * @return la devise
	 */
	public String getDevise() {
		return this.devise;
	}
	
	/**
	 * ajoute un montant a celui present
	 * 
	 * @param m le montant a ajouter
	 * @return un nouveau objet Money
	 */
	public Money add(Money m) {
		return new Money(this.getMontant()+m.getMontant(), this.getDevise());
	}
	
	/**
	 * compare deux objets Money
	 *
	 * @param ob Money a comparer
	 * @return si le montant et la devise est egale
	 */
	public boolean equals(Object ob) {
		if(ob != null && ob.getClass() == getClass())
			if(((Money)ob).montant == this.montant && ((Money)ob).devise == this.devise)
				return true;
		return false;
	}
	
	/**
	 * @return la description de la class
	 */
	public String toString() {
		return "Montant: " + montant + "\nDevise: " + devise;
	}
}
