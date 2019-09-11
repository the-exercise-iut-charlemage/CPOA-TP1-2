package tp2.exo2;

import java.util.StringTokenizer;

public class AdresseIP {

	short[] ip;
	
	public AdresseIP(StringTokenizer ip) {
		this.ip = new short[4];
		for(int i : this.ip)
			if(ip.hasMoreTokens())
				this.ip[i] = Short.parseShort(ip.nextToken());
	}
	
	@Override
	public String toString() {
		return ip[0] + "." + ip[1] + "." + ip[2] + "." + ip[3];
	}
}
