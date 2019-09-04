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

}
