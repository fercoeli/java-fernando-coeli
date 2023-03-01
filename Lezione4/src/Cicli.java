import java.util.Scanner;

public class Cicli {
    public static void main(String[] args) {
        /*
        // stampare da 1 a 100
        int indice = 1;
        int fine = 100;
        while(indice <= fine) {
            System.out.println(indice);
            indice++;
        }
        //for (inizializzazione; condizione; aggiornamento) {}
        // si possono ommetere le {} se solo 1 riga di codice nel blocco (anche nel if, while)
        // la variabili dichiarate dentro le {} solo valgono dentro le {}
        for(int j = 1; j <= fine; j++) {
            System.out.println(j);
        } */

        /*
        Scanner tasto = new Scanner(System.in);
        System.out.println("Inserire quanti numeri vuoi:");
        int quantita = Integer.parseInt(tasto.nextLine());
        double somma = 0;
        for(int indice = 0; indice < quantita; indice++) {
            System.out.println("Inserisci un numero");
            int numero = Integer.parseInt(tasto.nextLine());
            somma += numero;
        }
        System.out.println("La media di questi " + quantita + " numeri è: " + somma/quantita);
        */

        //quando inserisce -1 esce del programma y tira la media
        // si usa con while e if + cond booleana

        // Creare una calcolatrice
        Scanner tastiera = new Scanner(System.in);
        String risposta;
        int contatore = 0;
        do {
            System.out.println("Cosa vuoi fare? Inserisci il numero dell'operazione:\n" +
                    "1. somma \n" +
                    "2. sottrazione \n" +
                    "3. esci dal programma");
            risposta = tastiera.nextLine();
            if(risposta.equals("1")) {
                contatore++;
            } else if(risposta.equals("2")) {
                contatore--;
            }
            System.out.println(contatore);
        } while(!risposta.equals("3"));
    }
}
