package veletlenszamgeneralas;

import java.util.Arrays;
import java.util.Random;

public class VeletlenSzamGeneralas {

    public static void main(String[] args) {
        double tomb[] = new double[5];

        //5 tört véletlen szám 0 és 1 között 
        for (int i = 0; i < tomb.length; i++) {
            tomb[i] = Math.random();
            System.out.println(tomb[i] + "");
        }

        System.out.println();

        //10 egész véletlen szám 0 és 100 között 
        int tomb2[] = new int[10];
        int veletlenSzam;
        for (int i = 0; i < tomb2.length; i++) {
            veletlenSzam = (int) (Math.random() * 100);
            tomb2[i] = veletlenSzam;
            System.out.println(tomb2[i] + "");
        }

        System.out.println();
        //10 egész véletlen szám 1 és 100 között 
        int tomb3[] = new int[10];
        for (int i = 0; i < tomb3.length; i++) {
            veletlenSzam = (int) (Math.random() * 100 + 1);
            tomb3[i] = veletlenSzam;
            System.out.println(tomb3[i] + "");
        }

        System.out.println();
        
        //Véletlen szám generálás 1-től 100-ig hátultesztelő ciklussal
        int tomb4[] = new int[10];
        for (int i = 0; i < tomb4.length; i++) {
            do {
                veletlenSzam = (int) (Math.random() * 100);
            } while (veletlenSzam == 0);
            {
                tomb4[i] = veletlenSzam;
                System.out.println(tomb4[i] + "");
            }
        }
        
        System.out.println();
        
        //50 és -50 közötti véletlen számokat generál 
        int tomb5 [] = new int[10];
        Random random = new Random();
        for (int i = 0; i < tomb5.length; i++) {
            tomb5[i]= random.nextInt(100) - 50;
            System.out.println(tomb5[i] + "");
        }
        

    }

}
