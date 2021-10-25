package Clases_objetos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Leer_archivos {    
    
    public static void main(String[] args) {
        Escribir_fichero();
        Leer_fichero();
    }
 
    
    
    public static void Escribir_fichero()
    {
        FileWriter fichero = null;
        
        
       PrintWriter salida = null;
       
       try
        {
            File directorio = new File("src/datos");
            if (!directorio.exists()) {
                if (directorio.mkdirs()) {  
                } else { 
                    return;
                }
                
            }
            
            
            fichero = new FileWriter("src/datos/personas.txt");            
            salida = new PrintWriter(fichero);
            for (int j = 0; j < 4; j++){
                if (j==0)
                       salida.println("Codigo: 7501920004");
                      
                if (j==1)
                       salida.println("Nombres y apellidos: Juan Sebastian Figueroa Rodriguez");
                       
                if (j==2)
                       salida.println("Edad: 19");
                        
                if (j==3)
                       salida.println("Asignatura: Programacion Orientada a Objetos");
                     
            }      
            
           
 
        } catch (Exception e) {
        	e.printStackTrace();
        } finally {
        	try {

                    if (null != fichero)
                        fichero.close();
        	} catch (Exception e2) {
        		e2.printStackTrace();
        	}
        }
    }
    
    
    
    
    
    public static void Leer_fichero()
    {
       File archivo = null;
       
       FileReader leerarchivo = null;
       
       BufferedReader leertexto = null;
        
 
        try {

            archivo = new File ("src/datos/personas.txt");
            leerarchivo = new FileReader (archivo);
            leertexto = new BufferedReader(leerarchivo);
 
            String linea;
            while((linea=leertexto.readLine())!= null)
                System.out.println(linea);
        }
        catch(Exception e){
           e.printStackTrace();
        }
        finally{
           try{
              if( null != leerarchivo ){
                 leerarchivo.close();
              }
           }catch (Exception e2){
              e2.printStackTrace();
           }
        }
    }
    
}
