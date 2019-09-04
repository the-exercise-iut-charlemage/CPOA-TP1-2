import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import tp1.Money;

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
        money = money.add(money);
        assertEquals("La valeur redonné n'est pas la bonne", 20, money.getMontant());
    }

    @Test
    public void testDevise() {
        Money money = new Money(10, "EUR");
        assertEquals("La valeur redonné n'est pas la bonne", "EUR", money.getDevise());
    }

    @Test
    public void testEgalite() {
        Money money = new Money(10, "EUR");
        assertFalse("Un string n'est pas un objet Money", money.equals("Hello"));
        assertTrue("Money doit etre egale a lui même", money.equals(money));
        assertFalse("money ne doit pas etre egale a un null", money.equals(null));
    }

    @Test
    public void testToString() {
        Money money = new Money(10, "EUR");
        assertEquals("Le string n'est pas correct", "Montant: 10\nDevise: EUR", money.toString());
    }

}
