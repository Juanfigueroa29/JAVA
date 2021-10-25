package Clases;

public class Empleado extends Persona {
    
    private boolean trabajaEnAgencia;
    private String agenciaBancaria;
    private String correoInstitucional;
    private long telefonoOficina;
    private String jefeInmediato;
    private String cargo;

    public Empleado(boolean trabajaEnAgencia, String agenciaBancaria, String correoInstitucional, long telefonoOficina, String jefeInmediato, String cargo, String nombre, String apellido, String tipoDocumento, long numDocumento, String ciudad, String departamento, String pais, long telefono, String email, String fechaNacimiento, char sexo) {
        super(nombre, apellido, tipoDocumento, numDocumento, ciudad, departamento, pais, telefono, email, fechaNacimiento, sexo);
        this.trabajaEnAgencia = trabajaEnAgencia;
        this.agenciaBancaria = agenciaBancaria;
        this.correoInstitucional = correoInstitucional;
        this.telefonoOficina = telefonoOficina;
        this.jefeInmediato = jefeInmediato;
        this.cargo = cargo;
    }

    public boolean isTrabajaEnAgencia() {
        return trabajaEnAgencia;
    }

    public void setTrabajaEnAgencia(boolean trabajaEnAgencia) {
        this.trabajaEnAgencia = trabajaEnAgencia;
    }

    public String getAgenciaBancaria() {
        return agenciaBancaria;
    }

    public void setAgenciaBancaria(String agenciaBancaria) {
        this.agenciaBancaria = agenciaBancaria;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public long getTelefonoOficina() {
        return telefonoOficina;
    }

    public void setTelefonoOficina(long telefonoOficina) {
        this.telefonoOficina = telefonoOficina;
    }

    public String getJefeInmediato() {
        return jefeInmediato;
    }

    public void setJefeInmediato(String jefeInmediato) {
        this.jefeInmediato = jefeInmediato;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
     public void Registar_Empleado(){
    }
     
    public void actualizar_Empleado(){
    }
    
    public void mostrar_Empleado(){
    }
    
    public void eliminar_Empleado(){
    }
    
    

}
