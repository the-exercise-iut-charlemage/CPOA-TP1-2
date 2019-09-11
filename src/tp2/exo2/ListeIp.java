package tp2.exo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ListeIp {
    private Set<String> listIP;

    public ListeIp() {
        this.listIP = new HashSet<>();
    }

    public void chargeFicher(String nom) {
        try {
            FileInputStream inputStream = new FileInputStream(new File(nom));
            Scanner scanner = new Scanner(inputStream);
            StringBuilder builder = new StringBuilder();
            while (scanner.hasNext()) {
                builder.append(scanner.nextLine());
            }
            StringTokenizer rawToLine = new StringTokenizer(builder.toString(), "\n");
            List<String> tmpIP = new ArrayList<>();
            while (rawToLine.hasMoreTokens()) {
                StringTokenizer lineToIp = new StringTokenizer(rawToLine.nextToken(), " ");
                tmpIP.add(lineToIp.nextToken());
            }
            scanner.close();
            inputStream.close();
            this.listIP.addAll(tmpIP);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("The file can't be load!");
            System.exit(1);
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        this.listIP.forEach(e -> builder.append(e).append("\n"));
        return builder.toString();
    }
}
