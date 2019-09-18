package tp2;

import org.junit.Before;
import org.junit.Test;
import tp2.exo3.Etudiant;
import tp2.exo3.Formation;
import tp2.exo3.Identite;
import static org.junit.Assert.*;

public class TestEtudiant {

    private Formation formation_1;

    @Before
    public void setup() {
        this.formation_1 = new Formation();
        this.formation_1.ajouterMatiere("math", 3.0f);
        this.formation_1.ajouterMatiere("info", 6.0f);
    }

    @Test
    public void test_contruteur() {
        Identite identite = new Identite("XXXX-XXXX", "Nom", "Prenom");
        Etudiant etudiant = new Etudiant(identite, this.formation_1);
    }

    @Test
    public void test_ajout_note() {
        Identite identite = new Identite("XXXX-XXXX", "Nom", "Prenom");
        Etudiant etudiant = new Etudiant(identite, this.formation_1);
        etudiant.ajouterNote("info", 16.5f);
        etudiant.ajouterNote("math", 10.9f);
    }

    @Test
    public void test_calcule_moy() {
        Identite identite = new Identite("XXXX-XXXX", "Nom", "Prenom");
        Etudiant etudiant = new Etudiant(identite, this.formation_1);
        etudiant.ajouterNote("info", 20f);
        etudiant.ajouterNote("info", 10f);
        etudiant.ajouterNote("math", 0f);
        etudiant.ajouterNote("math", 20f);
        assertEquals(etudiant.calculerMoyenne("info"), 15f, 0f);
        assertEquals(etudiant.calculerMoyenne("math"), 10f, 0f);
        assertEquals(etudiant.calculerMoyenne(), 12.5f, 0f);
    }
}
