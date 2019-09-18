package tp2.exo3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Class contenent les information a propose d'un formation
 */
public class Formation {

    /**
     * Liste des matieres dans cette formation
     */
    private List<String> matieres;

    /**
     * Liste des coefficients dans chaque matiere
     */
    private Map<String, Integer> coefficients;

    /**
     * contruteur par defaut
     */
    public Formation() {
        this.matieres = new ArrayList<>();
        this.coefficients = new HashMap<>();
    }

    /**
     * Fonction utilise pour ajoute un matiere
     * @param matiere la matiere a ajout dans la formation
     */
    public void ajouterMatiere(String matiere) {
        this.matieres.add(matiere);
    }

    /**
     * Fonction pour suprrimé une matiere dans la formation
     * @param matiere la matiere a supprimé
     */
    public void supprimerMatiere(String matiere) {
        this.matieres.remove(matiere);
    }
    
    /**
     * fonction qui permé d'optenir les coef d'une matiere
     * @param matiere la matiere conserné
     * @return le coef conresné
     * @throws IllegalArgumentException erreur retouné si la matiere d'exsite pas
     */
    public int coefMatier(String matiere) throws IllegalArgumentException {
        Integer i = this.coefficients.get(matiere);
        if (i != null) return i;
        else throw new IllegalArgumentException("La matiere demandé (" + matiere + ") n'est pas presnete dans cette formation!");
    }
}
