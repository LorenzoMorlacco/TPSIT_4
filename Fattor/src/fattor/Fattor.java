
package fattor;

import java.util.Scanner;

public class Fattor {

    public static void main(String[] args) {
       
        int n=0,cont;// numero
        Fattoriale fat;// istanza oggetto
        
        Scanner input = new Scanner(System.in);
        
        do{// ciclo per evitare numeri negativi
            System.out.println("Inserisci il numero");
            cont = input.nextInt();
        }while(cont<1);
        
        while(n<cont){
            fat = new Fattoriale(n);//creazione oggetto
            fat.run();// richiamo metodo run
            n++;
        }       
    }
    
}
