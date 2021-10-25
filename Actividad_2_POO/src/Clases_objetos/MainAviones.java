
package Clases_objetos;

import javax.swing.JOptionPane;


public class MainAviones {
    public static void main(String [] args){
        Aviones avion = new Aviones("CC",1002273645,"Juan Figueroa",73625,"AVIANCA","Airbus Industrie A320");
        avion.mostrardatos();
        JOptionPane.showMessageDialog(null, "LAS HORAS SE INGRESAN EN DECIMALES Y MODO MILITAR");
        JOptionPane.showMessageDialog(null, "EJ: 2 HORAS, 15 MINUTOS = 2.15");
        JOptionPane.showMessageDialog(null, "EJ: SI SON LAS 3:00, ESCRIBIR 2:60");
        avion.pedirhoras();
        avion.duracion();
        avion.descuento();
        avion.cancelacion();
    }
}
