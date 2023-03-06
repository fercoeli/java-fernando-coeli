import java.util.Scanner;

public class EsRiscaldamento {
    /*
    Es 1 (5 minuti)
    [FOR/WHILE e array]
    Il parametro String[] args del metodo main è un parametro che viene inizializzato all'inizio del programma con ciò
    che viene inserito da terminale dopo "java [nomedelprogramma]".
    1) scrivere un programma StampaArgs che stampi il contenuto di args, eseguire scrivendo
    "java StampaArgs parola1 parola2 parola3"
    2) scrivere un programma Somma che sommi tutti i numeri dati per argomento (senza sapere a priori quanti argomenti)
    (esempio di esecuzione "java Somma 2 3 4" deve stampare 9)

    Es 2 (10 minuti)
    [Array con cicli più avanzati]
    Scrivere un programma che dopo aver chiesto due parole stampi le lettere in comune.
    Scrivere un programma che dati due array stampi se sono uguali o no.

    Es 3 (15 minuti)
    Scrivere un programma SecondoArray che chiede all'utente di inserire 10 numeri interi
    e li memorizza in un array (utilizzare metodo scritto in Util). Successivamente, in un metodo arrayPositivo()
    crea un nuovo array di dimensione pari al numero di valori maggiori o uguali a zero inseriti dall'utente e copia
    tutti i valori maggiori o uguali a zero nel nuovo array. Stampa i valori del nuovo array (usando il metodo scritto
    in Util).
    */

    //--------------------------------------------------------------------------------------------------------------
    //ESERCIZIO1 - 1)
    /*
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println("Gli argomenti sono: " + args[i]);
        }
    }
    */

    //ESERCIZIO 1 - 2)
    /*
    public static int somma(int... numeri) {
        Scanner tastiera = new Scanner(System.in);
        int somma = 0;
        for(int i=0; i < numeri.length; i++) {
            System.out.println("Inserisci un numero: ");
            int numero = Integer.parseInt(tastiera.nextLine());
            somma += numero;
        }
        return somma;
    }

    public static void main(String[] args) {
        int risultato = somma(2, 3, 4);
        System.out.println("la somma di tutti i numeri inseriti è: " + risultato);
    }

    //ALT sobre ARGS
    public static void main(String[] args) {
        int somma = 0;
        for(int i=0; i < args.length; i++) {
            somma += Integer.parseInt(args[i]);
        }
        System.out.println(somma);
    }

    */

    //ESERCIZIO 2
    //Scrivere un programma che dopo aver chiesto due parole stampi le lettere in comune.

    public static String lettereComuni(String parola1, String parola2) {
        //para la primera letra busco si existe en la segunda
        String risultato = "";
        parola1 = parola1.toLowerCase();
        parola2 = parola2.toLowerCase();
        for(int i = 0; i < parola1.length(); i++) {
            if(parola2.contains(parola1.substring(i,i+1))
                    && !risultato.contains(parola1.substring(i,i+1))) {
                risultato += risultato;
            }
        }
        return risultato;
    }

    public static void main(String[] args) {
        String stampa = lettereComuni("fernando", "nantes");
        System.out.println("Le lettere in comuni sono: " + stampa);
    }

}
