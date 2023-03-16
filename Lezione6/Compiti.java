import java.util.Scanner;

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

    public static void main(String[] args) {
        String codice= "53840";
        boolean tentativo = true;

        Scanner tastiera = new Scanner(System.in);
        System.out.println("Benvenuti al gioco INDOVINA IL CODICE");
        System.out.println("Avrai 10 opportunita di indovinare");

        for(int j=0; j<10 && tentativo; j++) {
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
                System.out.println("La quantita di cifre corrette e: " + cifreCorrette);
                System.out.println("La somma delle cifre corrette e: " + somma);

                System.out.println("Se vuoi avere un'altra opportunita, inserisci Y");
                String risposta = tastiera.nextLine();
                if (!risposta.equalsIgnoreCase("Y")) {
                    tentativo = false;
                }
            }
        }
    }
}
