import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.exit;

public class Compiti {
    /*
    [for, metodi di String]
    ES1 (tutti, 15 minuti): Si scriva un algoritmo per un semplice gioco che chieda di indovinare un codice
    numerico di cinque cifre. Quando l'utente scrive la risposta, il programma restituisce due valori:
    il numero di cifre al posto giusto e la somma di queste cifre. Per esempio, se il codice segreto è 53840
    e l'utente ipotizza 83241, le cifre 3 e 4 sono al posto giusto. Il programma restituisce in output i
    numeri 2 (cifre corrette) e 7 (somma). Si permetta all'utente di provare per 10 volte.
    (per il confronto utilizzare in un ciclo substring oppure charAt)
     */
    /*
    public static void main(String[] args) {
        String codice= "53840";
        boolean tentativo = true;

        Scanner tastiera = new Scanner(System.in);
        System.out.println("Benvenuti al gioco INDOVINA IL CODICE");
        System.out.println("Avrai 10 opportunita di indovinare");

        for(int j=0; j<9 && tentativo; j++) {
            int cifreCorrette = 0;
            int somma = 0;
            System.out.println("Inserisce un numero di 5 cifre:");
            String inserito = tastiera.nextLine();

            if(inserito.length() != 5) {
                System.out.println("Quantita di cifre inserite SBAGLIATE");
            } else {
                for (int i = 0; i < codice.length(); i++) {
                    if (codice.substring(i, i + 1).equalsIgnoreCase(inserito.substring(i, i + 1))) {
                        cifreCorrette++;
                        int conversione = Integer.parseInt(inserito.substring(i, i + 1));
                        somma += conversione;
                    }
                }

                if(cifreCorrette >=0 && cifreCorrette < 5) {
                    System.out.println("La quantita di cifre corrette e: " + cifreCorrette);
                    System.out.println("La somma delle cifre corrette e: " + somma);

                    System.out.println("Se vuoi avere un'altra opportunita, inserisci Y");
                    String risposta = tastiera.nextLine();
                    if (!risposta.equalsIgnoreCase("Y")) {
                        tentativo = false;
                    }
                } else {
                    System.out.println("HAI VINTO!!!!");
                    System.exit(0);
                }
            }
        }
    }
    */

    //ES3 (tutti):
    //Scrivere i seguenti metodi
    //inverti dato un array, restituisce l'array al contrario. Es: {1,2,3,4,5,6} ritorna: {6,5,4,3,2,1}
    //params: array: int[]
    //return: int[]
    /*
    public static int[] inverti(int[] arrayInt) {
        int[] arrayRes = new int[arrayInt.length];
        int j=0;
        for(int i = arrayInt.length - 1; i >= 0; i--) {
            arrayRes[j] = arrayInt[i];
            j++;
        }
        return arrayRes;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] arrayRisultato = inverti(array1);
        System.out.println("Array inizio: " + Arrays.toString(array1));
        System.out.println("Array invertito: " + Arrays.toString(arrayRisultato));
    }
     */


    //tuttoAttaccato: data una stringa restituisce la stringa eliminando gli spazi. Usare substring!
    //Scrivere un main per testare i metodi.

    //METODO CON 'REPLACE'
    public static String tuttoAttaccato(String frase) {
        String res;
        res = frase.replace(" ", "");
        return res;
    }

    //METODO CON 'SUBSTRING' (secondo la richiesta)
    public static String tuttoAttaccato1(String frase1) {
        String stringParziale = "";
        String parola = "";
        int i= 0;
        int n=0;
        do {
                parola = frase1.substring(i, frase1.indexOf(" ", i));
                stringParziale += parola;
                n = frase1.indexOf(" ", i);
                i = n + 1;
            } while (i <= frase1.lastIndexOf(" "));
        stringParziale += frase1.substring(frase1.lastIndexOf(" ")+1, frase1.length());
        return stringParziale;
    }



    public static void main(String[] args) {
        String originale = "Mi piace cantare sotto la pioggia";
        String risultato = tuttoAttaccato(originale);
        String risultato1 = tuttoAttaccato1(originale);
        System.out.println("La stringa originale e: " + originale + "\n");
        System.out.println("Risultato con metodo SUBSTRING:");
        System.out.println("La stringa senza spazi e: " + risultato1 + "\n");
        System.out.println("Risultato con metodo REPLACE:");
        System.out.println("La stringa senza spazi e: " + risultato);
    }

}
