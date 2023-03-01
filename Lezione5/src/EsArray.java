import Util.Util;

import java.util.Scanner;

public class EsArray {
    /*
        public static void main(String[] args) {
        int[] nomeArray = new int[5];
        nomeArray[0] = 1;
        nomeArray[1] = 4;
        System.out.println(nomeArray[0]);
        System.out.println(nomeArray.length);  //length senza le () perche non è un metodo

        int[] b = {1,2,3,4,5};
        int[][] c = new int[3][3];
        c[0][0] = 2;
        int[][] d = {{1,2,3}, {1,2,3},};

        for(int i=0; i<nomeArray.length; i++) {
            // nomeArray[i];
        }
    } */

    public static void main(String[] args) {
        int[] a = Util.crea(3);
        Util.stampa(a);
    }
}
