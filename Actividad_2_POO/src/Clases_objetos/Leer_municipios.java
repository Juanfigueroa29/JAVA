package Clases_objetos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Leer_municipios {    
    
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
            
            
             
            
            fichero = new FileWriter("src/datos/municipios.txt");            
            salida = new PrintWriter(fichero);
            for (int j = 0; j < 3; j++){
                if (j==0)
                       salida.println("Cartagena: 130010");
                      
                if (j==1)
                       salida.println("Barranquilla: 130011");
                       
                if (j==2)
                       salida.println("Bogota: 130012");
                        
                     
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

            archivo = new File ("src/datos/municipios.txt");
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
