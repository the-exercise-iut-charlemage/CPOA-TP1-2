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
    private Map<String, Float> coefficients;

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
    public void ajouterMatiere(String matiere, float coef) {
        this.matieres.add(matiere);
        this.coefficients.put(matiere, coef);
    }

    /**
     * Fonction pour suprrimé une matiere dans la formation
     * @param matiere la matiere a supprimé
     */
    public void supprimerMatiere(String matiere) {
        this.matieres.remove(matiere);
        this.coefficients.remove(matiere);
    }

    /**
     * fonction qui permé d'optenir les coef d'une matiere
     * @param matiere la matiere conserné
     * @return le coef conresné
     * @throws IllegalArgumentException erreur retouné si la matiere d'exsite pas
     */
    public float coefMatiere(String matiere) throws IllegalArgumentException {
        Float i = this.coefficients.get(matiere);
        if (i != null) return i;
        else throw new IllegalArgumentException("La matiere demandé (" + matiere + ") n'est pas presnete dans cette formation!");
    }

    public boolean contientMatiere(String matiere) {
        return this.matieres.contains(matiere);
    }

    /**
     * Use only in testing
     * @return Matieres list
     */
    @Deprecated
    public List<String> getMatieres() {
        return matieres;
    }

    /**
     * Use only in testing
     * @return coefficients map
     */
    @Deprecated
    public Map<String, Float> getCoefficients() {
        return coefficients;
    }
}
