package tp2;

import org.junit.Before;
import org.junit.Test;
import tp2.exo3.Etudiant;
import tp2.exo3.Formation;
import tp2.exo3.Groupe;
import tp2.exo3.Identite;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class TestGroup {

    private Formation formation;
    private List<Etudiant> etudiants;
    private Etudiant e1, e2, e3;

    @Before
    public void setup() {
        this.formation = new Formation();
        this.formation.ajouterMatiere("Info", 3.0f);
        this.etudiants = new ArrayList<>();
        e1 = new Etudiant(new Identite("1111-1111", "Nom1", "Pernom1"), this.formation);
        e2 = new Etudiant(new Identite("2222-2222", "Nom2", "Pernom2"), this.formation);
        e3 = new Etudiant(new Identite("3333-3333", "Nom3", "Pernom3"), this.formation);
        this.etudiants.add(e1); this.etudiants.add(e2); this.etudiants.add(e3);
    }

    @Test
    public void test_constructor() {
        Groupe groupe = new Groupe(this.etudiants, this.formation);
        assertEquals("Le group n'est pas le même" ,groupe.getEtu(), this.etudiants);
    }

    @Test
    public void test_ajout() {
        Groupe groupe = new Groupe(this.etudiants, this.formation);
        Etudiant e4 = new Etudiant(new Identite("4444-4444", "Nom4", "Pernom4"), this.formation);
        groupe.ajoutEtu(e4);
        this.etudiants.add(e4);
        assertEquals("Le group n'est pas le même" ,groupe.getEtu(), this.etudiants);
        this.etudiants.remove(e4);

    }

    @Test
    public void test_ajout_erreur() {
        Groupe groupe = new Groupe(this.etudiants, this.formation);
        Etudiant e1 = new Etudiant(new Identite("1111-1111", "Nom1", "Pernom1"), this.formation);
        groupe.ajoutEtu(e1);
        assertEquals("Le group n'est pas le même" ,groupe.getEtu(), this.etudiants);
    }

    @Test
    public void test_suppr() {
        Groupe groupe = new Groupe(this.etudiants, this.formation);
        Etudiant e1 = new Etudiant(new Identite("1111-1111", "Nom1", "Pernom1"), this.formation);
        groupe.supprEtu(e1);
        this.etudiants.remove(e1);
        assertEquals("Le group n'est pas le même" ,groupe.getEtu(), this.etudiants);
        this.setup(); // rebuild environment
    }

    @Test
    public void test_suppr_erreur() {
        Groupe groupe = new Groupe(this.etudiants, this.formation);
        Etudiant e4 = new Etudiant(new Identite("4444-4444", "Nom4", "Pernom4"), this.formation);
        groupe.supprEtu(e4);
        assertEquals("Le group n'est pas le même" ,groupe.getEtu(), this.etudiants);
    }

    @Test
    public void test_tri() {
        List<Etudiant> test_etudiants = new ArrayList<>();
        test_etudiants.add(e3); test_etudiants.add(e2); test_etudiants.add(e1);
        Groupe groupe = new Groupe(test_etudiants, this.formation);
        groupe.triAlpha();
        assertEquals("Le group n'est pas le même" ,groupe.getEtu(), this.etudiants);
    }

    @Test
    public void test_tri_note() {
        this.etudiants = new ArrayList<>();
        e1.ajouterNote("Info", 10f);
        e2.ajouterNote("Info", 15f);
        e3.ajouterNote("Info", 20f);
        etudiants.add(e3); etudiants.add(e2); etudiants.add(e1);
        Groupe groupe = new Groupe(etudiants, this.formation);
        groupe.triParMerite();
        assertEquals("Le group n'est pas le même" ,groupe.getEtu(), this.etudiants);
    }

    @Test
    public void test_moyenne() {
        this.etudiants = new ArrayList<>();
        e1.ajouterNote("Info", 10f);
        e2.ajouterNote("Info", 15f);
        e3.ajouterNote("Info", 20f);
        etudiants.add(e3); etudiants.add(e2); etudiants.add(e1);
        Groupe groupe = new Groupe(etudiants, this.formation);
        float moyenne = groupe.moyenne();
        assertEquals(15.0f, moyenne, 0f);
    }

    @Test
    public void test_moyenne_mat() {
        this.etudiants = new ArrayList<>();
        e1.ajouterNote("Info", 10f);
        e2.ajouterNote("Info", 15f);
        e3.ajouterNote("Info", 20f);
        etudiants.add(e3); etudiants.add(e2); etudiants.add(e1);
        Groupe groupe = new Groupe(etudiants, this.formation);
        float moyenne = groupe.moyenne("Info");
        assertEquals(15.0f, moyenne, 0f);
    }

}
