public class OccupazioneStanza {
    private String codStanza;
    private int numeroNellaStanza;
    private static int numeroTotale;

    public OccupazioneStanza(int occupanti, String codStanza) {
        this.numeroNellaStanza = occupanti;
        this.codStanza = codStanza;
    }
    public void aggiungiUnoAllaStanza() {
        this.numeroNellaStanza++;
        numeroTotale++;
    }

    public void rimuoviUnoDallaStanza() {
        if(this.numeroNellaStanza == 0) {
            System.out.println("\nLa stanza " + getCodStanza() + " è già vuota, non puoi rimuovere nessuna persona");
        } else {
            this.numeroNellaStanza--;
        }
        numeroTotale--;
    }

    public void getNumero()
    {
        System.out.println("Il numero totale nella stanza " + getCodStanza() + " è: " + this.numeroNellaStanza);
    }

    public int getNumeroNellaStanza()
    {
        return numeroNellaStanza;
    }

    public String getCodStanza() {
        return codStanza;
    }

    public static void getTotale() {
        System.out.println("\nIl numero di persone totale nell'ufficio è: " + numeroTotale);
    }


    public static void main(String[] args) {
        OccupazioneStanza stanza1 = new OccupazioneStanza(2, "101");
        OccupazioneStanza stanza2 = new OccupazioneStanza(3, "102");
        OccupazioneStanza stanza3 = new OccupazioneStanza(0, "103");
        OccupazioneStanza stanza4 = new OccupazioneStanza(1, "104");

        stanza1.getNumero();
        stanza2.getNumero();
        stanza3.getNumero();
        stanza4.getNumero();
        stanza2.aggiungiUnoAllaStanza();
        stanza3.rimuoviUnoDallaStanza();

        numeroTotale = stanza1.getNumeroNellaStanza() + stanza2.getNumeroNellaStanza() +
                stanza3.getNumeroNellaStanza() + stanza4.getNumeroNellaStanza();

        getTotale();
    }

}

