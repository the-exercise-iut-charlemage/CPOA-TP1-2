package tp2.exo3;

import java.util.List;

public class Groupe {

	private List<Etudiant> etu;
	private Formation form;

	public Groupe(List<Etudiant> etu, Formation form) {
		this.etu = etu;
		this.form = form;
	}

	public void ajoutEtu(Etudiant e) {
		if (e.getFormation().equals(form)) {
			etu.add(e);
		}
	}

	public void supprEtu(Etudiant e) {
		etu.remove(e);
	}

	public float moyenne(String matiere) {
		float res = 0;
		for (Etudiant etudiant : etu) {
			res += etudiant.calculerMoyenne(matiere);
		}
		return etu.isEmpty() ? -1 : res / etu.size();
	}

	public float moyenne() {
		float res = 0;
		for (Etudiant etudiant : etu) {
			res += etudiant.calculerMoyenne();
		}
		return etu.isEmpty() ? -1 : res / etu.size();
	}

	public void triParMerite() {
		for (int i = 0; i < etu.size(); i++) {
			float max = etu.get(i).calculerMoyenne();
			int index = i;
			for (int j = i; j < etu.size(); j++) {
				if (max < etu.get(j).calculerMoyenne()) {
					max = etu.get(j).calculerMoyenne();
					index = j;
				}
			}
			Etudiant tmp = etu.get(i);
			etu.set(i, etu.get(index));
			etu.set(index, tmp);
		}
	}

	public void triAlpha(){
		this.etu.sort(Etudiant::compareTo);
		/*for (int i = 0; i < etu.size(); i++) {
			Identite id = etu.get(i).getID();
			int index = i;
			for (int j = i; j < etu.size(); j++) {
				Identite id2 = etu.get(j).getID();
				if(id.getNom().compareTo(id2.getNom()) < 0) {
					id = id2;
					index = j;
				}
				else if(id.getNom().compareTo(id2.getNom()) == 0) {
					if(id.getPrenom().compareTo(id2.getPrenom()) < 0) {
						id = id2;
						index = j;
					}
				}
			}
			Etudiant tmp = etu.get(i);
			etu.set(i, etu.get(index));
			etu.set(index, tmp);
		}*/
	}

    /**
     * Use only in test
     */
    @Deprecated
    public List<Etudiant> getEtu() {
        return etu;
    }
}
