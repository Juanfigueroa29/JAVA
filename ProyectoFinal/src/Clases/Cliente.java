package Clases;

public class Cliente extends Persona {
    
    String tipoCliente;
    
    //información laboral
    String nombreEmpresa;
    String cargo;
    long telefonoOficina;
    
    //Información bancaria
    String codigoCliente;
    String tipoDeCuenta;
    String codigoCuetnaCliente;
    String fechaDeApertura;
    String stadoCuenta;
    
    String tipoDeOrganizacion;
    long numeroDeEmpleados;
    String representanteLegal;
    String getfechaDeApertura;

    public Cliente
        (
            String tipoCliente, 
            String nombreEmpresa, 
            String cargo, 
            long telefonoOficina, 
            String codigoCliente, 
            String tipoDeCuenta, 
            String codigoCuetnaCliente, 
            String fechaDeApertura, 
            String stadoCuenta, 
            String tipoDeOrganizacion, 
            long numeroDeEmpleados, 
            String representanteLegal, 
            String nombre, 
            String apellido, 
            String tipoDocumento, 
            long numDocumento, 
            String ciudad, 
            String departamento, 
            String pais, 
            long telefono, 
            String email, 
            String fechaNacimiento, 
            char sexo
        ) 
        {
        super(nombre, apellido, tipoDocumento, numDocumento, ciudad, departamento, pais, telefono, email, fechaNacimiento, sexo);
        this.tipoCliente = tipoCliente;
        this.nombreEmpresa = nombreEmpresa;
        this.cargo = cargo;
        this.telefonoOficina = telefonoOficina;
        this.codigoCliente = codigoCliente;
        this.tipoDeCuenta = tipoDeCuenta;
        this.codigoCuetnaCliente = codigoCuetnaCliente;
        this.fechaDeApertura = fechaDeApertura;
        this.stadoCuenta = stadoCuenta;
        this.tipoDeOrganizacion = tipoDeOrganizacion;
        this.numeroDeEmpleados = numeroDeEmpleados;
        this.representanteLegal = representanteLegal;
    }    

  

  

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public long getTelefonoOficina() {
        return telefonoOficina;
    }

    public void setTelefonoOficina(long telefonoOficina) {
        this.telefonoOficina = telefonoOficina;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getTipoDeCuenta() {
        return tipoDeCuenta;
    }

    public void setTipoDeCuenta(String tipoDeCuenta) {
        this.tipoDeCuenta = tipoDeCuenta;
    }

    public String getCodigoCuetnaCliente() {
        return codigoCuetnaCliente;
    }

    public void setCodigoCuetnaCliente(String codigoCuetnaCliente) {
        this.codigoCuetnaCliente = codigoCuetnaCliente;
    }

    public String getFechaDeApertura() {
        return fechaDeApertura;
    }

    public void setFechaDeApertura(String fechaDeApertura) {
        this.fechaDeApertura = fechaDeApertura;
    }

    public String getStadoCuenta() {
        return stadoCuenta;
    }

    public void setStadoCuenta(String stadoCuenta) {
        this.stadoCuenta = stadoCuenta;
    }

    public String getTipoDeOrganizacion() {
        return tipoDeOrganizacion;
    }

    public void setTipoDeOrganizacion(String tipoDeOrganizacion) {
        this.tipoDeOrganizacion = tipoDeOrganizacion;
    }

    public long getNumeroDeEmpleados() {
        return numeroDeEmpleados;
    }

    public void setNumeroDeEmpleados(long numeroDeEmpleados) {
        this.numeroDeEmpleados = numeroDeEmpleados;
    }

    public String getRepresentanteLegal() {
        return representanteLegal;
    }

    public void setRepresentanteLegal(String representanteLegal) {
        this.representanteLegal = representanteLegal;
    }
    public void Registar_Cliente(){
    }
     
    public void actualizar_Cliente(){
    }
    
    public void mostrar_Cliente(){
    }
    
    public void eliminar_Cliente(){
    }
    

}
