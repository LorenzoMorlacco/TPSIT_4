package areaperimetrorettangolo;

import java.util.Scanner;

public class AreaPerimetroRettangolo {
    
    public static void main(String[] args) {
        
        int b;// base
        int h;// altezza
        int P;// perimetro
        int A;// area
        
        Scanner input = new Scanner(System.in);
        do{
        //input base
        System.out.print("Inserisci la base ");
        b = input.nextInt();
        }while(b<1);
        
        do{
        //input altezza
        System.out.print("Inserisci l'altezza ");
        h = input.nextInt();
        }while(h<1);
        
        //calcolo e stampa del perimetro
        P = (b+h)*2;
        System.out.println("Perimetro = "+P);
        
        //calcolo e stampa dell'area
        A = b*h;
        System.out.println("Area = "+A);
    }
    
}
