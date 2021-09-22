package osszesrendezes;

public class OsszesRendezes {

    public static void main(String[] args) {
        /*Buborék rendezés*/

        int[] tomb = {3, 8, 2, 4, 5, 1, 6};
        int n = tomb.length; // A tömb elemeinek száma

        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (tomb[j] > tomb[j + 1]) {
                    int tmp = tomb[j];
                    tomb[j] = tomb[j + 1];
                    tomb[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println();

        /*így is meg lehet csinálni*/
        int[] tomb2 = {3, 8, 2, 4, 5, 1, 6};
        n = tomb2.length; // A tömb elemeinek száma

        for (int i = n - 2; i > 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (tomb[j] > tomb[j + 1]) {
                    int tmp = tomb[j];
                    tomb[j] = tomb[j + 1];
                    tomb[j + 1] = tmp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(tomb[i] + " ");
        }
        System.out.println();
    }

}
