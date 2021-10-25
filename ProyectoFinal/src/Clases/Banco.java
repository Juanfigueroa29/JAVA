/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


public class Banco {
    private String nombre_banco;
    private long codigo_banco;
    private String direccion_banco;
    private String ciudad_banco;
    private String departamento_banco;
    private String pais_banco;
    private long telefono_banco;
    private String email_banco;
    
    public Banco ( String nombre_banco, long codigo_banco, String direccion_banco, String ciudad_banco, String departamento_banco, String pais_banco, long telefono_banco, String email_banco ){
        
        
        this.nombre_banco = nombre_banco;
        this.codigo_banco = codigo_banco;
        this.direccion_banco = direccion_banco;
        this.ciudad_banco = ciudad_banco;
        this.departamento_banco = departamento_banco;
        this.pais_banco = pais_banco;
        this.telefono_banco = telefono_banco;
        this.email_banco = email_banco;
      
 }   

    public String getNombre_banco() {
        return nombre_banco;
    }

    public void setNombre_banco(String nombre_banco) {
        this.nombre_banco = nombre_banco;
    }

    public long getCodigo_banco() {
        return codigo_banco;
    }

    public void setCodigo_banco(long codigo_banco) {
        this.codigo_banco = codigo_banco;
    }

    public String getDireccion_banco() {
        return direccion_banco;
    }

    public void setDireccion_banco(String direccion_banco) {
        this.direccion_banco = direccion_banco;
    }

    public String getCiudad_banco() {
        return ciudad_banco;
    }

    public void setCiudad_banco(String ciudad_banco) {
        this.ciudad_banco = ciudad_banco;
    }

    public String getDepartamento_banco() {
        return departamento_banco;
    }

    public void setDepartamento_banco(String departamento_banco) {
        this.departamento_banco = departamento_banco;
    }

    public String getPais_banco() {
        return pais_banco;
    }

    public void setPais_banco(String pais_banco) {
        this.pais_banco = pais_banco;
    }

    public long getTelefono_banco() {
        return telefono_banco;
    }

    public void setTelefono_banco(long telefono_banco) {
        this.telefono_banco = telefono_banco;
    }

    public String getEmail_banco() {
        return email_banco;
    }

    public void setEmail_banco(String email_banco) {
        this.email_banco = email_banco;
    }
     public void Registar_Banco(){
    }
     
    public void actualizar_Banco(){
    }
    
    public void mostrar_Banco(){
    }
    
    public void eliminar_Banco(){
    }
    
    
}
