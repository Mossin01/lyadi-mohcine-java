package lezione2.riscaldamento;

import java.util.Scanner;

public class Es3 {
    public static void main(String[] args){
        Scanner tastiera = new Scanner(System.in);
        String nomeUtente = tastiera.nextLine();
        String password = tastiera.nextLine();
        boolean condizioni = nomeUtente.equals("utente") &&
                password.equals ("password");
        System.out.println(condizioni);
        if(condizioni){
            System.out.println("Messagio segreto");
        }else{
            System.out.println("User e/o password errati");
        }
    }
}
