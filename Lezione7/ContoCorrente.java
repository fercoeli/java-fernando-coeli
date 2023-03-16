import java.util.ArrayList;
import java.util.Scanner;

public class ContoCorrente {
    private String nome;
    private String cognome;
    private int saldo;
    private int id;
    private int pin;
    private Persona persona1;

    // public static final String NOME_BANCA = "Unicredit";    COSTANTE: per convenzione il nome MAIUSC y _per spazio
    private static int prossimoId;     //cosi diventa un attributo di classe (o statici) e NON del oggetto

    //un metodo di classe riceve parametri propri o attributi statici!! Non puo ricevere attributi di istanza!

    public ContoCorrente(String nome, String cognome, int saldo) {
        this.persona1 = new Persona(nome, cognome);
        this.saldo = saldo;
        //this.id = prossimoId++;
    }

    public ContoCorrente(Persona persona1, int saldo) {
        this.persona1 = persona1;
        this.saldo = saldo;
        //new Persona(nome, cognome);
    }

    @Override
    public String toString() {
        return "Il saldo del ContoCorrente e: " + saldo;
    }

    public int getSaldo() {         //questo e un GETTER
        return saldo;
    }

    public void setNome(String nome) {      //questo e un SETTER
        this.nome = nome;
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


}
