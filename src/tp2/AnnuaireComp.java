package tp2;

import java.util.HashMap;

public class AnnuaireComp extends HashMap<Personne, String>{

    private HashMap<Personne, String> hashMap;
    
    public AnnuaireComp() {
        this.hashMap = new HashMap<>();
    }

    public String acces(String nom, String prenom) {
        return hashMap.get(new Personne(nom, prenom));
    }

}
