
package Conteo;

import java.util.Scanner;



public class Municipio {

    private String nombre_municipio;
    private long codigo_municipio;
    private String calle;
    
    public Municipio (String nombre_municipio, long codigo_municipio ) {
        
        this.nombre_municipio = nombre_municipio;
        this.codigo_municipio = codigo_municipio;
     
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }
    

    public String getNombre_municipio() {
        return nombre_municipio;
    }

    public void setNombre_municipio(String nombre_municipio) {
        this.nombre_municipio = nombre_municipio;
    }

    public long getCodigo_municipio() {
        return codigo_municipio;
    }

    public void setCodigo_municipio(long codigo_municipio) {
        this.codigo_municipio = codigo_municipio;
    }
    
   // Municipios 
    
    String distrito_a = "A";
    String distrito_b = "B";
    String distrito_c = "C";
    
    public void encontrar_direccion(){
        System.out.println ("Empezamos el programa");
        Scanner entrada = new Scanner (System.in); 
        System.out.print("Ingrese calle de su direccion: ");
        calle = entrada.nextLine();
    }
    
    
}
