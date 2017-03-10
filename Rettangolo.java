package rettangololoop;

/**
 *
 * @author Lorenzo Morlacco 4° INA
 */
public class Rettangolo {
    
    private double  Base;
    private double  Altezza;
    
    public Rettangolo(double b,double h){
        this.Base=b;
        this.Altezza=h;
    }
    
    public double calcoloArea(){
        return (this.Base * this.Altezza);
    }
    
    public double calcoloPerimetro(){
        return (this.Base + this.Altezza)* 2;
    }
        
}
