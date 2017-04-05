/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rettanelpiano_morlacco;

/**
 *
 * @author studente1
 */
public class Retta {
    private double a;
    private double b;
    private double c;
    private String tipo;
    
    public Retta(double a1, double b1, double c1){
        this.a = a1;
        this.b = b1;
        this.c = c1;    
        
    }
    
    public String getTipo(){
        
        if(this.a==0){
            tipo="Retta orizzontale";
            //return tipo;
        }
        
        if(this.b==0){
            tipo="Retta verticale";
            
        }
        
        if((this.a!=0)&&(this.b!=0)){
            tipo="Retta obliqua";
            //return tipo;
        }
         return tipo;
    }
    
    public boolean appartiene(double x,double y){

        if((this.a*x + this.b*y + c)== 0){
            return true;
        }
        
        else return false;
    
    }
    
    public String stampa(){
        String retta;
        retta = ""+this.a+"x "+this.b+"y "+this.c+"= 0";
        return retta;
    
    }

}
