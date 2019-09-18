package tp2.exo2;

public class AdresseIP {

	private int[] ip;
	
	public AdresseIP(String ip) {
		this.ip = new int[4];
		String[] s = ip.split(".");
		for(int i=0 ; i < s.length; i++)
			this.ip[i] = Integer.parseInt(s[i]);
	}
	
	@Override
	public String toString() {
		return ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3];
	}
}
