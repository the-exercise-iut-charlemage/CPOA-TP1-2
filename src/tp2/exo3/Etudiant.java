package tp2.exo3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Etudiant {

	Identite id;
	Formation formation;
	Map<String, List<Float>> resultats;
	private float res = 0;
	private float size = 0;

	public Etudiant(Identite id, Formation formation) {
		this.id = id;
		this.formation = formation;
		resultats = new HashMap<>();
	}

	public void ajouterNote(String matiere, float note) {
	}

	public float calculerMoyenne(String matiere) {
		res = 0;
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
		res = 0;
		size = 0;
		resultats.forEach((k, v) -> {
			if (resultats.get(k) != null && !resultats.get(k).isEmpty()) {
				List<Float> l = resultats.get(k);
				for (int i = 0; i < l.size(); i++) {
					res += l.get(i) * formation.coefMatier(k);
					size ++;
				}
			}
		});
		return res;
	}
}
