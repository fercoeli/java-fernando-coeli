import java.util.Scanner;
public class EserciziArray {


    // Questo metodo serve per l'ESERCIZIO 1 e l'ESERCIZIO 2
    // L'obbietivo è creare e riempire un array a scelta dell'utente
    public static int[] creazioneArray() {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisce la lunghezza dell'array: ");
        int lunghezza = Integer.parseInt(tastiera.nextLine());
        int[] array = new int[lunghezza];
        for(int i=0; i < array.length; i++) {
            System.out.println("Inserisce il valore dell'elemento " + i + " dell'array: ");
            array[i] = Integer.parseInt(tastiera.nextLine());
        }
        return array;
    }


    // ESERCIZIO 1
    // metodo minimo -> restituisce il valore più piccolo
    /*
    public static int minimo(int[] array) {
        int minore = array[0];
        for(int i=1; i < array.length; i++) {
            if (array[i] < minore) {
                minore = array[i];
            }
        }
        return minore;
    }

    public static void main(String[] args) {
        int[] array = creazioneArray();
        int risultato = minimo(array);
        System.out.println("\nIl minimo valore dell'array è: " + risultato);
    }
    */

    // ESERCIZIO 2
    // metodo indiceMinimo -> restituisce l'indice del valore più piccolo
    /*
    public static int indiceMinimo(int[] array) {
        int indiceMinore = 0;
        int minore = array[0];
        for(int i=1; i < array.length; i++) {
            if (array[i] < minore) {
                minore = array[i];
                indiceMinore = i;
            }
        }
        return indiceMinore;
    }

    public static void main(String[] args) {
        int[] array = creazioneArray();
        int risultato = indiceMinimo(array);
        System.out.println("\nL'indice del minimo valore dell'array è: " + risultato);
    }
    */

    // ESERCIZIO 3
    // metodo sommaVettoriale: dati due array a1 e a2, restituire a3
    // che somma elemento per elemento
    // ES: [1,2,3] e [2,3,4,5] : ritorno [3,5,7,5]

    //Per questo esercizio si è deciso di non creare e riempire gli array,
    //ma di utilizzare due array già definiti.
    /*
    public static int[] sommaVettoriale(int[] arrayA1, int[] arrayA2) {
        int lunghezzaA3;
        if(arrayA1.length > arrayA2.length) {
            lunghezzaA3 = arrayA1.length;
        } else {
            lunghezzaA3 = arrayA2.length;
        }
        int[] arrayA3 = new int[lunghezzaA3];

        for(int i=0; i < arrayA3.length; i++) {
            int valoreA1 = 0;
            int valoreA2 = 0;
            if(i < arrayA1.length) {
                valoreA1 = arrayA1[i];
            }
            if(i < arrayA2.length) {
                valoreA2 = arrayA2[i];
            }
            arrayA3[i] = valoreA1 + valoreA2;
        }
        return arrayA3;
    }

    public static void stampa(int[] array) {
        for(int i = 0; i<array.length; i++) {
            System.out.println("L'elemento " + i + " " +
              "della somma vettoriale di emtrambi array è: " + array[i]);
        }
    }
    public static void main(String[] args) {
        int[] array1 = {1,2,3};
        int[] array2 = {2,3,4,5};
        int[] arrayRisultato = sommaVettoriale(array1, array2);
        stampa(arrayRisultato);
    }
    */
}
