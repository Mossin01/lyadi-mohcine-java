package lezione2.riscaldamento;

import java.util.Scanner;

public class Booleani {
    public static void main(String[] args){
      /*  boolean a = true, b = false;
        System.out.println(a);
        System.out.println(!a);
        System.out.println(b);
        System.out.println(!b);
        System.out.println("AND");
        System.out.println(a && a);
        System.out.println(a && b);
        System.out.println(b && a);
        System.out.println(b && b);
        System.out.println("OR");
        System.out.println(a || a);
        System.out.println(a || b);
        System.out.println(b || a);
        System.out.println(b || b);
   // == != <> <= >=
        Scanner tastiera = new Scanner (System.in);
       int eta = Integer.parseInt(tastiera.findInLine());
        boolean condizione = eta >= 18;
        System.out.println(condizione);*/
        Scanner tastiera = new Scanner (System.in);
     /*   System.out.println("metti numero: ");
        int numero = Integer.parseInt(tastiera.nextLine());
        boolean condizione = numero  >=0 && numero <=5;
        System.out.println(condizione);*/
        System.out.println("metti anno: ");
        int anno = Integer.parseInt(tastiera.nextLine());
        boolean  bisestile = anno% 4 == 0 && !  (anno % 100 == 0) || (anno % 400 == 0);
        System.out.println(bisestile);
    }
}
