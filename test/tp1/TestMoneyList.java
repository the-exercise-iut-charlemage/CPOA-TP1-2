import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tp1.DeviseException;
import tp1.Money;
import tp1.MoneyList;

public class TestMoneyList {
	
    @Test
    public void testAjoutVide() throws DeviseException {
    	MoneyList l = new MoneyList();
    	l.ajouterSomme(new Money(10, "EUR"));
    	//TODO
    }

    @Test
    public void testAjoutNormal() throws DeviseException {
    	MoneyList l = new MoneyList();
    	l.ajouterSomme(new Money(10, "EUR"));
    	l.ajouterSomme(new Money(5, "EUR"));
    	//TODO
    }

    @Test
    public void testAjoutDevise() throws DeviseException {
    	MoneyList l = new MoneyList();
    	l.ajouterSomme(new Money(10, "EUR"));
    	l.ajouterSomme(new Money(10, "DOL"));
    	//TODO
    }

    @Test
    public void testToString() throws DeviseException {
    	MoneyList l = new MoneyList();
    	l.ajouterSomme(new Money(10, "EUR"));
    	l.ajouterSomme(new Money(12, "DOL"));
    	assertEquals("","Money List:\n  Montant: 10    Devise: EUR\n  Montant: 12    Devise: DOL" , l.toString());
    }

    @Test
    public void testEqualsTrue() {
    	//TODO
    }

    @Test
    public void testEqualsFalse() {
    	//TODO
    }
}
