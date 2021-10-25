
package Clases_objetos;

// Atributos

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aviones {
   public Aviones (String tipo_doc,int numero, String nombre_completo, int codigo, String aerolinea, String clase_avion) {
        
        this.numero=numero;
        this.nombre_completo=nombre_completo;        
        this.codigo=codigo; 
        this.aerolinea=aerolinea; 
        this.clase_avion=clase_avion;
        this.tipo_doc=tipo_doc;
        
} 
    private String tipo_doc;
    private int numero;
    private String nombre_completo;
    private float hora_partida;
    private float hora_llegada;
    private int codigo;
    private String aerolinea;
    private int valor;
    private String clase_avion;
    private float duracion;
    private int respuesta;
    private int respuesta2;
    private String cancelacion;
// Metodos
    // Setter y Getter

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public float getHora_partida() {
        return hora_partida;
    }

    public void setHora_partida(float hora_partida) {
        this.hora_partida = hora_partida;
    }

    public float getHora_llegada() {
        return hora_llegada;
    }

    public void setHora_llegada(float hora_llegada) {
        this.hora_llegada = hora_llegada;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getClase_avion() {
        return clase_avion;
    }

    public void setClase_avion(String clase_avion) {
        this.clase_avion = clase_avion;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public int getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(int respuesta2) {
        this.respuesta2 = respuesta2;
    }

    public String getCancelacion() {
        return cancelacion;
    }

    public void setCancelacion(String cancelacion) {
        this.cancelacion = cancelacion;
    }
    
    // Metodo Mostrar datos
    public void mostrardatos (){
        System.out.println("Tpo de documento: "+tipo_doc);
        System.out.println("Numero: "+numero);
        System.out.println("Nombre: "+nombre_completo);
        System.out.println("Nombre Aerolinea: "+aerolinea);
        System.out.println("Clase de avion: "+clase_avion);
        System.out.println("Codigo de vuelo: "+codigo);
        
     }   
    // Metodo pedir datos
    public void pedirhoras(){
        
        hora_partida = (float) Float.parseFloat(JOptionPane.showInputDialog("INGRESE HORA DE PARTIDA"));
        hora_llegada = (float) Float.parseFloat(JOptionPane.showInputDialog("INGRESE HORA DE LLEGADA"));
        
      }    
    // Metodo Calculo de horas
     public void duracion (){
        duracion = (hora_llegada - hora_partida);
        System.out.println("Su vuelo duro: "+ duracion +" horas.");
        
    }
     

    
    // Metodo Descuento
     public void descuento (){
  
        respuesta = JOptionPane.showConfirmDialog(null, "¿Ha viajado mas de 7 veces en el ultimo mes?");
        if (respuesta == JOptionPane.YES_OPTION){
           System.out.println("Valor pasaje: GRATIS (BENEFICIO VIAJERO FRECUENTE)");     
           }
        else {
           System.out.println("Valor pasaje: 550.000");  
        }
          
        }
    // Metodo Cancelacion de vuelo
     public void cancelacion (){
       respuesta2 = JOptionPane.showConfirmDialog(null, "¿Desea cancelar su vuelo?");
        if (respuesta == JOptionPane.YES_OPTION){
           System.out.println("SU VUELO HA SIDO CANCELADO");  
     }
    }

  
  
}
