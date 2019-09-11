package tp1;

import java.util.ArrayList;
import java.util.List;

public class MoneyList {
	
	private List<Money> list;
	
	public MoneyList(){
		list= new ArrayList<Money>();
	}
	
	public List<Money>getList() {
		return list;
	}
	
	public void ajouterSomme (Money m) throws DeviseException {
		boolean add = false;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getDevise() == m.getDevise()) {
				list.get(i).add(m);
				add = true;
				break;
			}
		}
		if(!add) {
			list.add(m);
		}
	}
	
	@Override
	public String toString() {
		String s = "Money List:";
		for (int i = 0; i < list.size(); i++) {
			s += "\n  " + list.get(i).toString();
		}
		return s;
	}
	
	@Override
	public boolean equals(Object obj) {
		for (int i = 0; i < list.size(); i++) {
			if(!list.get(i).equals(obj))
				return false;
		}
		return true;
	}
}