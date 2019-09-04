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
        assertEquals("La valeur redonné et pas la bonne", 10, money.getMontant());
    }

    @Test
    public void testMontantAdd() {
        Money money = new Money(10, "EUR");
        money = money.add(money);
        assertEquals("La valeur redonné et pas la bonne", 20, money.getMontant());
    }

    @Test
    public void testDevise() {
        Money money = new Money(10, "EUR");
        assertEquals("La valeur redonné et pas la bonne", "EUR", money.getDevise());
    }

    @Test
    public void testEqualite() {
        Money money = new Money(10, "EUR");
        assertFalse("Un string n'est a un Money", money.equals("Hello"));
        assertTrue("Money doit etre equele a lui même", money.equals(money));
        assertFalse("money doit pas etre equela a un null", money.equals(null));
    }

    @Test
    public void testToString() {
        Money money = new Money(10, "EUR");
        assertEquals("Un string n'est a un Money", "Montant: 10\nDevise: EUR", money.toString());
    }

}
