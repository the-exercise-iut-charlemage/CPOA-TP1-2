package tp2.exo3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etudiant {

	private Identite id;
	private Formation formation;
	private Map<String, List<Float>> resultats;

	public Etudiant(Identite id, Formation formation) {
		this.id = id;
		this.formation = formation;
		resultats = new HashMap<>();
	}

	public void ajouterNote(String matiere, float note) throws IllegalArgumentException {
		if (note >= 0 && note <= 20) {
			if (this.resultats.containsKey(matiere)) {
				this.resultats.get(matiere).add(note);
				return;
			} else if (this.formation.contientMatiere(matiere)) {
				this.resultats.put(matiere, new ArrayList<>());
				this.resultats.get(matiere).add(note);
				return;
			}
		}
		throw new IllegalArgumentException("La note et/ou la matiere donnée ne sont pas resevable");
	}

	public float calculerMoyenne(String matiere) {
		float res = 0;
		if (resultats.get(matiere) == null || resultats.get(matiere).isEmpty()) {
			return -1;
		}
		List<Float> l = resultats.get(matiere);
		for (int i = 0; i < l.size(); i++) {
			res += l.get(i);
		}
		return res / l.size();
	}

	public float calculerMoyenne() {

		float nbMat = 0f;
		float moy = 0f;

		for (String mat: this.resultats.keySet()) {
			moy += this.calculerMoyenne(mat);
			nbMat++;
		}

		return nbMat!=0?moy/nbMat:-1;
	}

	public Formation getFormation() {
		return formation;
	}
	
	public Identite getID() {
		return id;
	}
}
