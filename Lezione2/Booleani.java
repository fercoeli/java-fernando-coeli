
import java.util.Scanner;
/* 
public class Booleani {
    public static void main(String[] args) {
        // not !
        // and &&
        // or ||
        //boolean a = true;
        //boolean b = false;

        // ==, !=, <, >,    altri operatori, non esiste il ===

        Scanner tasto = new Scanner(System.in);
        System.out.println("Inserisci 1 nro");
        int num = Integer.parseInt(tasto.nextLine());
        boolean pari = (num % 2 == 0);
        boolean dispari = (num % 2 == 1);
        System.out.println("E pari: " + pari);
        System.out.println("E dispari: " + dispari);
    }
}
 */
/* 
public class Booleani {
    public static void main(String[] args) {
        Scanner tasto = new Scanner(System.in);
        System.out.println("Inserisci 1 nro");
        int num = Integer.parseInt(tasto.nextLine());
        boolean voto = (num >= 0 && num <=10);
        System.out.println("Il numero e un voto: " + voto);

    }
}
 */

/* 
public class Booleani {
    public static void main(String[] args) {
        Scanner tasto = new Scanner(System.in);
        System.out.println("Inserisci 1 nro");
        int num = Integer.parseInt(tasto.nextLine());
        boolean voto = ((num % 2 == 0) || (num < 5));
        System.out.println("Il numero e pari o minore di 5: " + voto);
    }
}
 */

/* 
public class Booleani {
    public static void main(String[] args) {
        Scanner tasto = new Scanner(System.in);
        System.out.println("Inserisci 1 nro");
        int num = Integer.parseInt(tasto.nextLine());
        boolean voto = ((num > 1000) && (num % 10 == 3));
        System.out.println("Il numero e maggiore di 1000 e finisce in 3: " + voto);
    }
}
 */

/* 
public class Booleani {
    public static void main(String[] args) {
        Scanner tasto = new Scanner(System.in);
        System.out.println("Inserisci 1 nro");
        int num = Integer.parseInt(tasto.nextLine());
        boolean voto = ((num % 4 == 0) && (num % 100 != 0)) || (num % 400 == 0);
        System.out.println("L'anno e bisestile: " + voto);
    }
}

 */

public class Booleani {
    public static void main(String[] args) {
        Scanner tasto = new Scanner(System.in);
        System.out.println("Inserisci 3 misure");
        int num1 = Integer.parseInt(tasto.nextLine());
        int num2 = Integer.parseInt(tasto.nextLine());
        int num3 = Integer.parseInt(tasto.nextLine());
        boolean voto = (num1 < (num2+num3)) && (num2 < (num1+num3)) && (num3 < (num1+num2));
        System.out.println("Il triangolo si puo formare: " + voto);
    }
}