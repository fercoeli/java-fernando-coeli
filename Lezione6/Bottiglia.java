import java.util.Objects;

public class Bottiglia {
    private int capacita;                   //con private no se puede modificar desde afuera
    private int quantita;

    public Bottiglia(int capacita) {
        this.capacita = capacita;           //this: indica questa istanza
        this.quantita = 0;
        //this(capacita, 0);                //è meglio richiamare al costruttore di sotto perchè se si aggiorna, quindi
                                            //questo metodo è aggiornato
    }

    //OVERLOADING
    public Bottiglia(int capacita, int quantita) {
        if(capacita<0)
            this.capacita = 0;
        else
            this.capacita = capacita;
        if(quantita<0)
            this.quantita = 0;
        else
            this.quantita = quantita;
    }

    @Override
    public String toString() {
        return "Bottiglia = {" +
                "capacita=" + capacita +
                ", quantita=" + quantita +
                '}';
    }

    //metodo di classe: lo puo usare anche senza una istanza (STATIC), inizia con MAIUSCOLO
    //metodo di istanza, per quello NON SI USA "STATIC", sono collegati alla istanza, per quello sono
    //dentro l'istanza non si possono usare senza l'istanza.

    public void riempi(int q) {     //el this no es necesario porque el parametro es distinto del atributo
        if(q<0) {
            System.out.println("ERRORE");
        } else {
            quantita += q;
            if(q>quantita) {
                quantita = capacita;
            }
        }
    }

    public void svuota(int q) {
        quantita -= q;
    }

}


