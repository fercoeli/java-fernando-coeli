import java.util.ArrayList;
import java.util.Scanner;

public class MainContoCorrente {

    public static void main(String[] args) {
        ContoCorrente conto = new ContoCorrente("Fernando", "Coeli", 300);
        ContoCorrente conto1 = new ContoCorrente(new Persona("fernando", "coeli"), 500);
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
                    System.out.println(conto);  //se chiamo il getter sarebbe lo stesso
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

        /*
        ArrayList<Integer> conti = new ArrayList<Integer>();
        conti.add(10);
        conti.add(11);
        conti.add(12);
        conti.add(13);
        conti.add(14);
        conti.add(15);
        conti.add(16);
        conti.add(17);
        conti.add(18);
        conti.add(19);
        */


    }

}
