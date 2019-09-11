package tp2;

import org.junit.Test;
import tp2.exo2.ListeIp;

public class TestListeIP {

    @Test
    public void test_constructor() {
        ListeIp listeIp = new ListeIp();
    }

    @Test
    public void test_load_file() {
        ListeIp listeIp = new ListeIp();
        listeIp.chargeFicher("D:\\logs.txt");
    }

    @Test
    public void test_to_string() {
        ListeIp listeIp = new ListeIp();
        listeIp.chargeFicher("D:\\logs.txt");
        System.out.println(listeIp.toString());
    }
}
