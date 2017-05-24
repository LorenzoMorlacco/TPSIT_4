
package fattor;

import java.util.Scanner;

public class Fattoriale extends Thread {
    
    private int n = 1;
    private int i;
    private int cont;
    
    public Fattoriale(int num){// costruttore
        this.i = num;
    }
    
    public void run(){// metodo run
        
        for(cont=0;cont<i;cont++){// calcolo fattoriale
            this.n = this.n * (this.cont+1);
        }
        System.out.println(""+this.n);//stampa del risultato
    }
}
