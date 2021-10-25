
package Operaciones;


public class Operaciones {
    
    // ATRIBUTOS
    private double num1;
    private double num2;
    private double res;
    
    // CONSTRUCTOR POR DEFECTO
    public Operaciones () {} 
    
    // CONSTRUCTOR
    public Operaciones (double num1, double num2) { 
        this.num1=num1;
        this.num2=num2;      
    }

    
    // SETTER AND GETTER
    
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
    
    
    
    
    // METODO SUMA
     public void suma (){
        res = (num1 + num2);
        System.out.println("RESULTADOP SUMA: "+res);
    }
     
    // METODO RESTA
     public void resta (){
 
        res = (num1 - num2);
        System.out.println("RESULTADOP RESTA: "+res);
    }
     
    // METODO MULTIPLICACION 
     public void multiplicacion (){

        res = (num1 * num2);
        System.out.println("RESULTADOP MULTIPLICACION: "+res);
    }
     
    // METODO DIVISION 
     
     public void division (){
         res = (num1 / num2);
         System.out.println("RESULTADOP DIVISION: "+res);
    }
     
    // METODO MOD
     
      public void mod (){
        res = (num1 % num2);
        System.out.println("RESULTADOP MOD: "+res+"\n");
    }
      
 
}
