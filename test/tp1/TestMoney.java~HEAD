import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import tp1.Money;
import tp1.DeviseException;

import java.util.ArrayList;

public class TestMoney {

    @Before
    public void preInit() {
    }

    @Test
    public void testMontant() {
        Money money = new Money(10, "EUR");
        assertEquals("La valeur redonné n'est pas la bonne", 10, money.getMontant());
    }

    @Test
    public void testMontantAdd() {
        Money money = new Money(10, "EUR");
        try {
			money.add(money);
		} catch (DeviseException e) {
	        assertTrue("L'exception n'est pas gerer", true);
		}
        assertEquals("La valeur redonné n'est pas la bonne", 20, money.getMontant());
    }

    @Test(expected = DeviseException.class)
    public void testMontantAddException() {
        Money money = new Money(10, "EUR");
		try {
			money.add(money);
		} catch (DeviseException e) {
		}
    }

    @Test
    public void testDevise() {
        Money money = new Money(10, "EUR");
        assertEquals("La valeur redonné n'est pas la bonne", "EUR", money.getDevise());
    }

    @Test
    public void testEgalite() {
        Money money = new Money(10, "EUR");
        Money money2 = new Money(5, "EUR");
        Money money3 = new Money(5, "DOL");
        assertFalse("Un string n'est pas un objet Money", money.equals("Hello"));
        assertTrue("Money doit etre egale a lui même", money.equals(money));
        assertFalse("money ne doit pas etre egale a un null", money.equals(null));
        assertFalse("", money.equals(money2));
    }
    
    @Test(expected = DeviseException.class)
    public void testEgaliteException() {
    Money money = new Money(10, "EUR");
    Money money2 = new Money(10, "DOL");
    money.equals(money2);
    }

    @Test
    public void testToString() {
        Money money = new Money(10, "EUR");
        assertEquals("Le string n'est pas correct", "Montant: 10    Devise: EUR", money.toString());
    }

}
