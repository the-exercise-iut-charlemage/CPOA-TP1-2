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

    @Test(expected = IllegalArgumentException.class)
    public void test_ajout_bad_note() {
        Identite identite = new Identite("XXXX-XXXX", "Nom", "Prenom");
        Etudiant etudiant = new Etudiant(identite, this.formation_1);
        etudiant.ajouterNote("info", 40f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_ajout_bad_note_matiere() {
        Identite identite = new Identite("XXXX-XXXX", "Nom", "Prenom");
        Etudiant etudiant = new Etudiant(identite, this.formation_1);
        etudiant.ajouterNote("bdd", 10f);
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_ajout_bad_note_matiere_null() {
        Identite identite = new Identite("XXXX-XXXX", "Nom", "Prenom");
        Etudiant etudiant = new Etudiant(identite, this.formation_1);
        etudiant.ajouterNote(null, 10f);
    }

    @Test
    public void test_calcule_moy() {
        Identite identite = new Identite("XXXX-XXXX", "Nom", "Prenom");
        Etudiant etudiant = new Etudiant(identite, this.formation_1);
        etudiant.ajouterNote("info", 20f);
        etudiant.ajouterNote("info", 10f);
        etudiant.ajouterNote("math", 0f);
        etudiant.ajouterNote("math", 20f);
        assertEquals(15f, etudiant.calculerMoyenne("info"), 0f);
        assertEquals(10f, etudiant.calculerMoyenne("math"),  0f);
        assertEquals(12.5f, etudiant.calculerMoyenne(), 0f);
    }

    @Test
    public void test_calcule_moy_faild_no_note() {
        Identite identite = new Identite("XXXX-XXXX", "Nom", "Prenom");
        Etudiant etudiant = new Etudiant(identite, this.formation_1);
        assertEquals(-1f, etudiant.calculerMoyenne("dkgjkdfghjk"), 0f);
        assertEquals(-1f, etudiant.calculerMoyenne(), 0f);
    }
}
