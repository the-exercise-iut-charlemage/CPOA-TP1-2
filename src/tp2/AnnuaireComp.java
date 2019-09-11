package tp2;

import java.util.HashMap;

public class AnnuaireComp{

    private HashMap<Personne, String> hashMap;
    
    public AnnuaireComp() {
        this.hashMap = new HashMap<>();
    }

    public String acces(String nom, String prenom) {
        return hashMap.get(new Personne(nom, prenom));
    }

    public void domaine() {
        this.hashMap.keySet().forEach(e -> System.out.println(e.getNom()));
    }

    public void adjonction(String nom, String prenom, String num) {
        this.hashMap.put(new Personne(nom, prenom), num);
    }

    public void suppression(String nom, String prenom) {
        this.hashMap.remove(new Personne(nom, prenom));
    }

    public void changement(String nom, String prenom, String num) {
        this.hashMap.replace(new Personne(nom, prenom), num);
    }
}
