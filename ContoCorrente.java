import java.util.Scanner;

public class ContoCorrente {
    private String nome;
    private String cognome;

    private int saldo;

    public ContoCorrente(String nome, String cognome, int saldo) {
        this.nome = nome;
        this.cognome = cognome;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Il saldo del ContoCorrente e: " + saldo;
    }

    public void deposita(int quantita) {
        if(quantita < 0) {
            System.out.println("Non si puo depositare un monto negativo");
        } else {
            saldo += quantita;
            System.out.println("Operazione eseguita con esito");
        }
    }

    public void preleva(int ritiro) {
        if(ritiro < 0) {
            System.out.println("Non si puo prelevare un monto negativo");
        } else if (ritiro > saldo) {
            System.out.println("Non hai abbastanza denaro. Il massimo da prelevare e: " + saldo);
        } else {
            saldo -= ritiro;
            System.out.println("Operazione eseguita con esito");
        }
    }

    public static void main(String[] args) {
        ContoCorrente conto = new ContoCorrente("Fernando", "Coeli", 300);
        Scanner tastiera = new Scanner(System.in);
        boolean ciclo = true;
        do {
            System.out.println("Inserire un numero secondo l'operazione a realizzare:\n" +
                    "1 per prelevare\n" +
                    "2 per depositare\n" +
                    "3 per conoscere il saldo");
            int scelta = Integer.parseInt(tastiera.nextLine());

            switch (scelta) {
                case 1:
                    System.out.println("Inserire monto a prelevare");
                    int prelevo = Integer.parseInt(tastiera.nextLine());
                    conto.preleva(prelevo);
                    break;
                case 2:
                    System.out.println("Inserire monto a depositare");
                    int deposito = Integer.parseInt(tastiera.nextLine());
                    conto.deposita(deposito);
                    break;
                case 3:
                    System.out.println(conto);
                    break;
                default:
                    System.out.println("Non hai scelto un'operazione disponibile");
            }
            System.out.println("\nInserisci Y se vuoi fare un'altra operazione oppure si chiude il terminale");
            String risposta = tastiera.nextLine();

            if (!risposta.equalsIgnoreCase("Y")) {
                ciclo = false;
            }
        } while(ciclo);
    }
}
