
package Conteo;

import javax.swing.JOptionPane;


public class Personas {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String lugar_nacimiento;
    private int edad;
    private int dni;
    private long estatura;
    private String sexo; 
    private String estudios;
    
    
   
    
    
    
    public Personas (String nombre, String apellido, String fechadeNacimineto, String lugar_nacimiento, long edad, long estatura, String sexo, String estudios) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.lugar_nacimiento =lugar_nacimiento;
        this.edad = (int) edad;
        this.sexo =sexo;
        this.estudios =estudios;
     
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public int getEdad() {
        return  edad;
    }

    public void setEdad(long edad) {
        this.edad = (int) edad;
    }

    public long getEstatura() {
        return estatura;
    }

    public void setEstatura(long estatura) {
        this.estatura = estatura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstudios() {
        return estudios;
    }

    public void setEstudios(String estudios) {
        this.estudios = estudios;
    }
    
    
    
    
    // Pedir datos 
    public void pedir_datos(){
    edad = (int) Float.parseFloat(JOptionPane.showInputDialog("INGRESE EDAD: "));
    }
    
    // Metodo para mayores de 16 años 
    public void edad (){
        if (edad>16) {
        dni = (int) Float.parseFloat(JOptionPane.showInputDialog("INGRESE DNI: "));
        

        } else {

        

        }
    }
    
    
    
    
    
    
   
    
}