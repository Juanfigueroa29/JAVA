/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operaciones;

/**
 *
 * @author Usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Operaciones operacion = new Operaciones (3,4);
        operacion.suma();
        operacion.resta();
        operacion.multiplicacion();
        operacion.division();
        operacion.mod();
        
        
    }
    
}
