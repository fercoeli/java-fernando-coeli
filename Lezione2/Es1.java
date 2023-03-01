/* 
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Scanner tasto = new Scanner(System.in);
        System.out.println("Inserisci 3 numeri");
        int num1 = Integer.parseInt(tasto.nextLine());
        int num2 = Integer.parseInt(tasto.nextLine());
        int num3 = Integer.parseInt(tasto.nextLine());
        double res = (num1 + num2 + num3) / 3;
        System.out.println("La media dei 3 numeri inseriti è: " + res);
    }
}
*/
 // Chiedere un nro di 4 cifra e stampare un nro per riga
/* 
 import java.util.Scanner;

 public class Es1 {
    public static void main(String[] args) {
        Scanner tasto = new Scanner(System.in);
        System.out.println("Inserisci 1 nro di 4 cifre");
        int number = Integer.parseInt(tasto.nextLine());
        int num1 = number/1000;                 // ottengo il primo numero
        int num2 = (number % 1000) / 100;       // ottengo il secondo prendendo il resto
        int num3 = (number % 100) / 10;         // cosi via
        int num4 = (number % 10);               // cosi via
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }
 }
*/

 import java.util.Scanner;
 import java.lang.Math;

 public class Es1 {
    public static void main(String[] args) {
        Scanner tasto = new Scanner(System.in);
        System.out.println("Inserisci una T in Celsius");
        double number = Double.parseDouble(tasto.nextLine());
        double celsius = 5 * (number - 32) / 9;
        double celApros = Math.round(celsius*100)/100.0;
        System.out.println("La temperatura in Celsius è:" + celApros);
    }
 }