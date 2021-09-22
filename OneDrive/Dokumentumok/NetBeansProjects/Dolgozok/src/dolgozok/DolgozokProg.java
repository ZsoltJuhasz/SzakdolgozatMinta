package dolgozok;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DolgozokProg {

    public static void main(String[] args) throws IOException {

        List<String> adatok = (Files.readAllLines(Paths.get("dolgozok.txt")));

        List<Dolgozo> dolgozok = new ArrayList<>();

        for (String sor : adatok) {
            if (!sor.contains("NÉV;KOR;NEME;Munk.ÉV")) {
                Dolgozo dolgozo = new Dolgozo(sor);
                dolgozok.add(dolgozo);
            }
        }
        System.out.println("1. feladat");
        for (Dolgozo beolvaso : dolgozok) {
            System.out.println(beolvaso);
        }

        System.out.println("2. feladat");
        System.out.println("dolgozók száma: " + dolgozok.size());

        System.out.println("3. fealadat");
        int ennyiEve = 0;
        for (int i = 0; i < dolgozok.size(); i++) {
            if (dolgozok.get(i).getNEME().equals("L")) {
                ennyiEve += dolgozok.get(i).getMunkEV();
            }
        }

        System.out.println("Ennyi éve dolgoznak együtt a lányok összesen: " + ennyiEve);

        System.out.println("4. feladat");
        int max = 0;
        String neve = "";
        for (int i = 0; i < dolgozok.size(); i++) {
            if (dolgozok.get(i).getKOR() > max && dolgozok.get(i).getNEME().equals("F")) {
                max = dolgozok.get(i).getKOR();
                neve = dolgozok.get(i).getNEV();

            }
        }
        System.out.println("A legidősebb fiú: " + neve);

        System.out.println("5. feladat");
        boolean vanE = false;
        for (int i = 0; i < dolgozok.size(); i++) {
            String n = dolgozok.get(i).getNEV();
            int hossz = n.length();
            char lc = n.charAt(hossz-1);
            if (n.charAt(hossz - 1) == 'a') {
                n = dolgozok.get(i).getNEV();
                vanE = true;;
            }
        }

        if (vanE == true) {
            System.out.println("Igen van a betűre végződő név");
        } else {
            System.out.println("Nem nincsen a betűre végződő név");
        }

        System.out.println("6.feladat");
        
        Scanner sc = new Scanner(System.in);
        
        String user;
        do {
            System.out.println("Adjon meg egy nevet: ");
            user = sc.next();
        } while(!(user.length() >= 3));
        
        boolean van = false;
        for (int i = 0; i < dolgozok.size(); i++) {
            if(dolgozok.get(i).getNEV().equals(user)){
                van = true;
                System.out.println(dolgozok.get(i));
            }
        }
        if(van == false){
            System.out.println("Nincs ilyen név!");
        }

        System.out.println("7.feladat");

        System.out.println("Elkészült a \"fiatalok.txt\"");
        String fej = "NÉV;KOR;NEME;Munk.ÉV";

        List<String> kiLista = new ArrayList<>();
        kiLista.add(fej);

        for (Dolgozo dolgozo : dolgozok) {
            if (dolgozo.getKOR() < 25 && dolgozo.getMunkEV() >= 2) {
                String nev = dolgozo.getNEV();
                int kor = dolgozo.getKOR();
                String neme = dolgozo.getNEME();
                int munkEv = dolgozo.getMunkEV();
                String ki = String.format("%s;%d;%s;%d", nev, kor, neme, munkEv);
                kiLista.add(ki);
            }
        }

        Files.write(Paths.get("fiatalok.txt"), kiLista);

    }

}
