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

    @Before
    public void setup() {
        this.formation = new Formation();
        this.formation.ajouterMatiere("Info", 3.0f);
        this.etudiants = new ArrayList<>();
        Etudiant e1 = new Etudiant(new Identite("1111-1111", "Nom1", "Pernom1"), this.formation);
        Etudiant e2 = new Etudiant(new Identite("2222-2222", "Nom2", "Pernom2"), this.formation);
        Etudiant e3 = new Etudiant(new Identite("3333-3333", "Nom3", "Pernom3"), this.formation);
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
    public void test_suppr_erreut() {
        Groupe groupe = new Groupe(this.etudiants, this.formation);
        Etudiant e4 = new Etudiant(new Identite("4444-4444", "Nom4", "Pernom4"), this.formation);
        groupe.supprEtu(e4);
        assertEquals("Le group n'est pas le même" ,groupe.getEtu(), this.etudiants);*
    }

}
