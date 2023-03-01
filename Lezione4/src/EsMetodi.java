public class EsMetodi {
    /*
    public static void saluta() {
        System.out.println("Ciao");
    }

    public static int somma(int n1, int n2) {
        return n1 + n2;
    }

    public static void main(String[] args) {
        saluta();
        int a = somma(1,2);
        System.out.println(a);
    }

     */
    /*
    public static int maggiore(int n1, int n2) {
        if(n1>n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public static void main(String[] args) {
        int risultato = maggiore(3, 5);
        System.out.println(risultato);
    }

     */

    public static String capitalize(String s) {
        //String prima = s.substring(0,1);
        //String primaMaiu = prima.toUpperCase();
        String resto = s.substring(1, s.length());
        //String finale = primaMaiu + resto;
        //return finale;
        char primo = s.charAt(0);  // devo aggiungere +32 al ASCII della minuscola
        int minuscolo = (int)primo;
        int secondo = minuscolo - 32;
        char secondoMaiu = (char)secondo;
        String finale = secondoMaiu + resto;
        return finale;
    }

    public static void main(String[] args) {
        String res = capitalize("fernando");
        System.out.println(res);
    }

}
