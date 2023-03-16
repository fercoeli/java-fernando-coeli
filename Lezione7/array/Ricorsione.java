package array;

public class Ricorsione {
    /*
    public static void m1() {
        //if(cond per terminare)
        //   caso base
        //else
        //   chimata ricorsiva
        //m1();
    }

    public static void countdown(int i) {
        System.out.println(i);
        if(i>0)
            countdown(i-1);
    }
    */
    // ES1: fattoriale
    public static int fattoriale(int n) {
        int risultato;
        if(n>0) {
           risultato = n * fattoriale(n-1);
        } else {
            risultato = 1;
        }
        return risultato;
    }
    public static void main(String[] args) {
        int c = fattoriale(5);
        System.out.println(c);
    }

    // ES2: metodo ricorsivo che stampa i pari da 0 a n
    public static void pari(int n, int i) {
        if(n<0) {
            System.out.println("errore");
        } else {
                System.out.println(0);
                n = n-1 ;
                System.out.println(n);
                pari(n-2);

        }

    }

}
