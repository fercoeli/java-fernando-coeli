import java.util.Random;
import java.util.Scanner;

public class EsMetodi {
    /** metodo dado() che restituisce un numero da 1 a 6. Usare la classe Random
     * @return      int da 1 a 6


    public static int dado() {
        Random numeri = new Random();
        int risultato = numeri.nextInt(6) + 1;
        return risultato;
    }
    public static void main(String[] args) {
        System.out.println(dado());
    }
     */

    /**
     * metodo tuttiPari(int n) che chiede n numeri e ritorna true se sono tutti pari
     * non usare array (non memorizzare i numeri)
     * @param   n   quanti numeri chiedere
     * @return      true se tutti i numeri chiesti sono pari, altrimenti false
     */
/*
    public static boolean tuttiPari(int n) {
        Scanner tasto = new Scanner(System.in);
        //System.out.println("Quanti numeri vuoi inserire: ");
        //int n = Integer.parseInt(tasto.nextLine());
        boolean risp = true;
        for(int i=0; i<n; i++) {
            System.out.println("Inserire un numero intero:");
            int num = Integer.parseInt(tasto.nextLine());
            //if(!(num % 2 == 0)) {
            //    risp = false;
            risp = risp && num % 2 == 0;
            //}
        }
        return risp;
    }

    public static void main(String[] args) {
        boolean prova = tuttiPari(4);
        System.out.println(prova);
    }
*/
    /**
     * metodo soloVocali(String s) che restituisce le vocali della stringa
     * esempio: "Ciao come stai?" -> "iaooeai"
     * /*@param  s  una stringa
     * @return      le vocali della stringa
     * */
    /*
    public static String soloVocali(String s) {
        String vocali = "";
        for (int j = 0; j < s.length(); j++) {
            char ch = s.charAt(j);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vocali += ch;
            }

        }
        return vocali;
    }

    public static void main(String[] args) {
        String ris = soloVocali("Ciao come stai?");
        System.out.println(ris);
    }
    */

    /*

    * Scrivere un programma ContinuaFino che chiede all'utente di inserire una sequenza di
interi. Il programma continua a chiedere all'utente di inserire valori
 tanto che i valori inseriti soddisfano
almeno una delle seguenti condizioni:
- è negativo e divisibile per 2
- è positivo e divisibile per 3
Al termine il programma stampa la somma di tutti i valori inseriti escluso quello ha violato le condizioni.
Risolvere questo esercizio senza usare array.
* */

    public static int continuaFino() {
        Scanner tasto = new Scanner(System.in);
        //System.out.println("Inserice un numero intero:");
        //int numero = Integer.parseInt(tasto.nextLine());
        int ris = 0;
        int numeroA;
            do {
                System.out.println("Inserice un numero intero:");
                numeroA = Integer.parseInt(tasto.nextLine());
                if(numeroA < 0 && numeroA % 2 == 0 || numeroA > 0 && numeroA % 3 == 0) {
                    ris += numeroA;
                }
            } while (numeroA < 0 && numeroA % 2 == 0 || numeroA > 0 && numeroA % 3 == 0);
        return ris;
    }

    public static void main(String[] args) {
        int res = continuaFino();
        System.out.println(res);
    }
}

