package tp2.exo3;

import java.util.ArrayList;
import java.util.List;

public class Formation {

    private List<String> matieres;

    public Formation() {
        this.matieres = new ArrayList<>();
    }

    public void ajouterMatiere(String matiere) {
        this.matieres.add(matiere);
    }

    public void supprimerMatiere(String matiere) {
        this.matieres.remove(matiere);
    }
    
}
