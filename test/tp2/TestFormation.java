package tp2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import tp2.exo3.Formation;

public class TestFormation {

	@SuppressWarnings("deprecation")
	@Test
	public void ajout() {
		Formation f = new Formation();
		f.ajouterMatiere("math", 3);
		assertTrue("", f.getMatieres().contains("math"));
		assertEquals("",3.0,  f.coefMatiere("math"));
	}

	@Test
	public void suppr() {
	}

	@Test
	public void coef() {
		
	}
}
