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
	public Money add(Money m) throws DeviseException {
		if (!m.getDevise().equals(this.devise))
			throw new DeviseException("Les deviss ne sont pas les même!");
		return new Money(this.getMontant()+m.getMontant(), this.getDevise());
	}
	
	/**
	 * compare deux objets Money
	 *
	 * @param ob Money a comparer
	 * @return si le montant et la devise est egale
	 */
	@Override
	public boolean equals(Object ob) {
		if(ob != null && ob.getClass() == getClass())
			if(((Money)ob).montant == this.montant && ((Money) ob).devise.equals(this.devise))
				return true;
		return false;
	}
	
	/**
	 * @return la description de la class
	 */
	@Override
	public String toString() {
		return "Montant: " + montant + "\nDevise: " + devise;
	}
}
