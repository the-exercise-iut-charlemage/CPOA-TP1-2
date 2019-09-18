package tp2.exo3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Formation {

    private List<String> matieres;

    private Map<String, Integer> coefficients;

    public Formation() {
        this.matieres = new ArrayList<>();
        this.coefficients = new HashMap<>();
    }

    public void ajouterMatiere(String matiere) {
        this.matieres.add(matiere);
    }

    public void supprimerMatiere(String matiere) {
        this.matieres.remove(matiere);
    }

    public int coefMatier(String matiere) throws IllegalArgumentException {
        Integer i = this.coefficients.get(matiere);
        if (i != null) return i;
        else throw new IllegalArgumentException("La matiere demandé (" + matiere + ") n'est pas presnete dans cette formation!");
    }
}
