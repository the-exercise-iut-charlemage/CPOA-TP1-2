package tp2.exo3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etudiant {

	Identite id;
	Formation formation;
	Map<String, List<Float>> resultats;

	public Etudiant(Identite id, Formation formation) {
		this.id = id;
		this.formation = formation;
		resultats = new HashMap<>();
	}

	public void ajouterNote(String matiere, float note) {
		if (note >= 0 && note <= 20 && resultats.containsKey(matiere))
			if (resultats.get(matiere) == null)
				resultats.replace(matiere, new ArrayList<Float>());
		resultats.get(matiere).add(note);
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
		float res = 0;
		resultats.forEach((k, v) -> {
			if (resultats.get(k) != null && !resultats.get(k).isEmpty()) {
				List<Float> l = resultats.get(k);
				for (int i = 0; i < l.size(); i++) {
					res += l.get(i);
				}
				res /= l.size();
			}
		});
	}
}
