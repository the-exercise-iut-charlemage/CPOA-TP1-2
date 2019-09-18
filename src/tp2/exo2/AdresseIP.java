package tp2.exo2;

import java.util.Arrays;
import java.util.StringTokenizer;

public class AdresseIP {

	private int[] ip;
	
	public AdresseIP(String ip) {
		this.ip = new int[4];
		StringTokenizer tokenizer = new StringTokenizer(ip, ".");
		int i = 0;
		while (tokenizer.hasMoreTokens()) {
			this.ip[i] = Integer.valueOf(tokenizer.nextToken());
			i++;
		}
	}
	
	@Override
	public String toString() {
		return ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3];
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		AdresseIP adresseIP = (AdresseIP) o;

		return Arrays.equals(ip, adresseIP.ip);
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(ip);
	}
}
