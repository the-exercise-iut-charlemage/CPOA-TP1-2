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
		if(e.getFormation().equals(form)) {
			etu.add(e);
		}
	}
	
	public void supprEtu(Etudiant e) {
		etu.remove(e);
	}
	
	public float moyenne(String matiere) {
		float res=0;
		for (Etudiant etudiant : etu) {
			res += etudiant.calculerMoyenne(matiere);
		}
		return etu.isEmpty()?-1:res/etu.size();
	}

	public float moyenne() {
		float res=0;
		for (Etudiant etudiant : etu) {
			res += etudiant.calculerMoyenne();
		}
		return etu.isEmpty()?-1:res/etu.size();
	}
}
