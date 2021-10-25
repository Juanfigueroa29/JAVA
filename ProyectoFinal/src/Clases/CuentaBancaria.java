
package Clases;


public class CuentaBancaria {
   
    long Saldodisponible;
    long Saldodiferido;
    long Saldopromedio;
    
    
   public CuentaBancaria ( String tipoDeCuenta, String agenciaBancaria, String codigoCuetnaCliente, String fechaDeApertura, 
           String stadoCuenta, String codigoCliente, long Saldodisponible, long Saldodiferido, long Saldopromedio ){
        
        this.Saldodisponible = Saldodisponible;
        this.Saldodiferido = Saldodiferido;
        this.Saldopromedio = Saldopromedio;
        
 }   

    public long getSaldodisponible() {
        return Saldodisponible;
    }

    public void setSaldodisponible(long Saldodisponible) {
        this.Saldodisponible = Saldodisponible;
    }

    public long getSaldodiferido() {
        return Saldodiferido;
    }

    public void setSaldodiferido(long Saldodiferido) {
        this.Saldodiferido = Saldodiferido;
    }

    public long getSaldopromedio() {
        return Saldopromedio;
    }

    public void setSaldopromedio(long Saldopromedio) {
        this.Saldopromedio = Saldopromedio;
    }
    
    public void Registar_CuentaBancaria(){
    }
    public void actualizar_CuentaBancaria(){
    }
    
    public void mostrar_CuentaBancaria(){
    }
    public void eliminar_CuentaBancaria(){
    }
    
    
}
