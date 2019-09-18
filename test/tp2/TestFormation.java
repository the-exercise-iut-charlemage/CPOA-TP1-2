package tp2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import tp2.exo3.Formation;

@SuppressWarnings("deprecation")
public class TestFormation {

	@Test
	public void ajout() {
		Formation f = new Formation();
		f.ajouterMatiere("math", 3.0f);
		assertEquals("La liste est vide", 1, f.getMatieres().size());
		assertEquals("La matiere ne conrespond pas", "math", f.getMatieres().get(0));
	}

	@Test
	public void suppr() {
<<<<<<< HEAD
		Formation f = new Formation();
		f.ajouterMatiere("math", 3.0f);
		f.supprimerMatiere("math");
		assertEquals("La liste n'est pas vide", 0, f.getMatieres().size());
=======
>>>>>>> 4d4114dce3a697296e38a3b6e8baa78d24f7a34d
	}

	@Test
	public void coef() {
		Formation f = new Formation();
		f.ajouterMatiere("math", 3.0f);
		assertEquals(3.0f, f.coefMatiere("math"), 0f);
	}
}
