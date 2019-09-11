package tp2;

import java.util.HashMap;

public class Annuaire{
	
	private HashMap<String, String> map;
	
	public static void main(String[] args) {
		Annuaire a = new Annuaire();
		a.adjonction("lul", "00");
		a.adjonction("lol", "00");
		a.domaine();
	}
	
	public Annuaire() {
		map = new HashMap<String, String>();
	}
	
	public void domaine() {
		//System.out.println(map.toString());
		this.map.keySet().forEach(System.out::println);
	}
	
	public String acces(String nom) {
		return map.get(nom);
	}
	
	public void adjonction(String nom, String num) {
		map.put(nom, num);
	}
	
	public void suppression(String nom) {
		map.remove(nom);
	}
	
	public void changement(String nom, String num) {
		map.replace(nom, num);
	}
}
