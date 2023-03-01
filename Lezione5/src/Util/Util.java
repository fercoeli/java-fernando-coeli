package Util;

import java.util.Scanner;

public class Util {
    public static void riempi(int[] array) {
        Scanner tastiera = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Inserisci un numero: ");
            array[i] = Integer.parseInt(tastiera.nextLine());
        }
    }

    public static int[] crea(int n) {
        int[] array = new int[n];
        riempi(array);
        return array;
    }

    /* creare il metodo stampa (int[] a) */
    public static void stampa(int[] a) {
        for(int i = 0; i<a.length; i++) {
            System.out.println(a[i]);
        }
    }

    /* metodo minimo -> restituisce il valore più piccolo
    *  metodo indiceMinimo -> restituisce l'indice del valore più piccolo
    *  metodo sommaVettoriale: dati due array a1 e a2, restituire a3
    *  che somma elemento per elemento
    *  ES: [1,2,3] e [2,3,4,5] : ritorno [3,5,7,5]
    */
}
