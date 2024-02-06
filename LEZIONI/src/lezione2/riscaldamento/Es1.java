package lezione2.riscaldamento;

import java.util.Scanner;
/*Scrivere un programma che chiede in input due numeri e stampa la somma*/
public class   Es1 {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.print("inserisci un numero");
        int n1 = Integer.parseInt(tastiera.nextLine());
        System.out.println("inserisci un numero");
        int n2 = Integer.parseInt(tastiera.nextLine());
        System.out.print("la somma e " + (n1+n2));



    }
}
