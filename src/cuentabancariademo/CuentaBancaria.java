
package cuentabancariademo;

import java.math.BigDecimal;

/**
 * @author Omar Acosta
 */
public class CuentaBancaria {

    private String titularCuenta;
    
    //Saldo solo puede modificarse a través de los métodos deposita/retira,
    //por lo que no tiene métodos accesor.
    private BigDecimal saldo;

    public CuentaBancaria(String titularCuenta) {
        this.titularCuenta = titularCuenta;
        this.saldo = new BigDecimal(0);
    }

    /*
    Precondition: El objeto this.saldo debe estar instanciado e inicializado
    con un valor.
    Postcondition: El contenido de this.saldo se aumentará en la cantidad de
    a.
    */
    public void deposita(BigDecimal a) {
        //validar que saldo esté instanciado
        if (this.saldo != null) {
            this.saldo = this.saldo.add(a);
        }
    }

        /*
    Precondition: El objeto this.saldo debe estar instanciado e inicializado
    con un valor. El valor de this.saldo debe ser mayor que a.
    Postcondition: El contenido de this.saldo se disminuirá en la cantidad de
    a. Si el resultado de la resta es menor que 0, se imprimirá un mensaje de
    error en pantalla y no se realizará la operación.
    */
    public void retira(BigDecimal a) {
        if (saldo.compareTo(a) >= 0) {
            this.saldo = this.saldo.subtract(a);
        } else {
            System.out.println("ERROR: Fondos insuficientes!");
        }

    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }
    
    @Override
    public String toString() {
        return "Titular: " + this.titularCuenta + "\n Saldo: " 
                           + this.saldo.toString();
    }

}
