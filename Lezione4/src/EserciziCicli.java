import java.sql.SQLOutput;
import java.util.Scanner;
public class EserciziCicli {
    public static void main(String[] args) {
        /*
    // ESERCIZIO 1: calcolare la somma dei primi n numeri dispari.
    // esempio: n = 9, calcolare 1 + 3 + 5 + 7+ 9

        int somma = 0;
        int n = 9;
        for(int i=1; i <= n; i+=2) {
            somma += i;
        }
        System.out.println("la somma dei numeri dispari è: " + somma);
    */
    /*
    // ESERCIZIO 2: invertire una stringa s
    // esempio: s = "ciao", restituire "oaic"

        String s = "ciao";
        String nuova = "";

        for (int i=0; i<s.length(); i++) {
            char ch = s.charAt(i); //extracts each character
            nuova = ch + nuova; //aggiunge il carattere alla nuova stringa
        }
        System.out.println("la stringa originale è: " + s);
        System.out.println("la stringa invertita è: " + nuova);
    */
    /*
    // ESERCIZIO 3: programma che controlla se una parola è palindroma
    // FARE CON LA LOGICA DI DUE INDICI!!!!!!
    // esempio: anna : true, carla : false
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisce una parola:");
        String parola = tastiera.nextLine();
        String nuova = "";

        for (int i=0; i<parola.length(); i++) {
            char ch = parola.charAt(i);
            nuova = ch + nuova;
        }

        if(parola.equalsIgnoreCase(nuova)) {
            System.out.println("Le parola è palindroma");
        } else {
            System.out.println("Le parole NON è palindroma");
        }
    */
    // ESERCIZIO ALBERO (prima una volta, dopo chiedere repetizione)
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisce quante righe vuoi:");
        int righe = Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserisce quante volte ripetere:");
        int ripetizioni = Integer.parseInt(tastiera.nextLine());
        for(int j=1; j <= ripetizioni; j++) {
            String rama = "*";
            System.out.println(rama);
            for (int i = 1; i < righe; i++) {
                rama = rama + "*";
                System.out.println(rama);
            }
        }
    }
}