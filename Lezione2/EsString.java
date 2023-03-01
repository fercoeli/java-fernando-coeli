/* 
public class EsString {
    public static void main(String[] args) {
        String s = "Ciao";
        System.out.println(s.length());
        String sub = s.substring(1, 3);   //non compressa la ultima cifra
        System.out.println(sub);

        
    }
}
 */

/* 
public class EsString {
    public static void main(String[] args) {
        String s = "Fernando";
        String sub = s.substring(1, s.length());
        System.out.println(sub);
    }
}
 */

import java.util.Scanner;

public class EsString {
    public static void main(String[] args) {
        String s = "Fernando";
        //Scanner tasto = new Scanner(System.in);
        //String inser = tasto.nextLine();
        String smodif = s.replace("er", "ch");
        System.out.println(smodif);
    }
}
