/* 
import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Scanner tasto = new Scanner(System.in);
        System.out.println("Inserisci 3 numeri");
        int num1 = Integer.parseInt(tasto.nextLine());
        int num2 = Integer.parseInt(tasto.nextLine());
        int num3 = Integer.parseInt(tasto.nextLine());
        
        if(num1 > num2 && num1 > num3) {
            System.out.println(num1);
            if(num2>num3) {
                System.out.println(num2);
                System.out.println(num3);
            } else {
                System.out.println(num3);
                System.out.println(num2);
            }
        } 
        if (num2 > num1 && num2 > num3){
            System.out.println(num2);
            if(num1>num3) {
                System.out.println(num1);
                System.out.println(num3);
            } else {
                System.out.println(num3);
                System.out.println(num1);
            }
        }
        if (num3 > num1 && num3 > num2){
            System.out.println(num3);
            if(num2>num1) {
                System.out.println(num2);
                System.out.println(num1);
            } else {
                System.out.println(num1);
                System.out.println(num2);
            }
        }
    }
}
 */

 /* 
import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Scanner tasto = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");
        String nome = tasto.nextLine();
        if(nome.charAt(0) == 'a' || nome.charAt(0) == 'A') {
            System.out.println("Ciao");
        } else {
            System.out.println("Buongiorno");
        }
    }
}
 */

//chiedere giorno e mese e dire se e una data

import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Scanner tasto = new Scanner(System.in);
        System.out.println("Inserisci due numeri");
        int giorno = Integer.parseInt(tasto.nextLine());
        int mese = Integer.parseInt(tasto.nextLine());
        if(mese == 1 || mese == 3 || mese == 5 || mese == 7 || mese == 8 || mese == 10 || mese == 12) {
            if(giorno <= 1 && giorno <= 31) {
                System.out.println("la data e corretta");
            }
        }
        if(mese == 4 || mese == 6 || mese == 9 || mese == 11) {
            if(giorno <= 1 && giorno <= 30) {
                System.out.println("la data e corretta");
            }
        }

        if(mese == 2) {
            if(giorno <= 1 && giorno <= 28) {
                System.out.println("la data e corretta");
            }
        }
    }
}
