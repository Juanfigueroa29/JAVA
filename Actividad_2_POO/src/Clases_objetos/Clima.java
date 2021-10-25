package Clases_objetos;

//Atributos

import javax.swing.JOptionPane;

public class Clima {
    public Clima (String ciudad, int dia, int humedad, int viento, int precipitacion) {
        this.ciudad=ciudad;
        this.dia=dia;
        this.humedad=humedad;        
        this.viento=viento; 
        this.precipitacion=precipitacion;   
}
    private String ciudad;
    private int dia;
    private float grados;
    private int humedad;
    private int viento;
    private int precipitacion;
    private float conversion;
 
    
    
    //Metodos 

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public float getGrados() {
        return grados;
    }

    public void setGrados(float grados) {
        this.grados = grados;
    }

    public int getHumedad() {
        
        return humedad;
    }

    public void setHumedad(int humedad) {
     
        this.humedad = humedad;
    }

    public int getViento() {
        return viento;
    }

    public void setViento(int viento) {
        this.viento = viento;
    }

    public int getPrecipitacion() {
        return precipitacion;
    }

    public void setPrecipitacion(int precipitacion) {
        this.precipitacion = precipitacion;
    }

    public float getConversion() {
        return conversion;
    }

    public void setConversion(float conversion) {
        this.conversion = conversion;
    }
    
 // Metodo Ingresar grados
    public void leerNumero(){
        grados = Integer.parseInt(JOptionPane.showInputDialog("Digite grados"));  
}
    
    // Metodo convertir Grados A Fahrenheit 
    public void convesion (){
        conversion = 32 + (9 * grados / 5);
    }
    
    
    
    
    
    
    // Metodo mostrar datos del clima
    public void mostrar (){
        System.out.println("Ciudad: "+ciudad);
        System.out.println("Dia: "+dia);
        System.out.println("Grados: "+grados);
        System.out.println("Grados Fahrenheit: "+conversion);
        System.out.println("Humedad: "+humedad);
        System.out.println("Precipitacion: "+precipitacion);
        System.out.println("Viento: "+viento);
    }
    }
    

