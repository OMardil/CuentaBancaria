/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancariademo;

import java.math.BigDecimal;

/**
 *
 * @author Omar Acosta
 */
public class CuentaBancariaDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancaria c1 = new CuentaBancaria("Omar Acosta");
        System.out.println(c1);
        
        BigDecimal b1 = new BigDecimal(1135459/15);
        c1.deposita(b1);
        System.out.println(c1);
        
        b1 = new BigDecimal(100);
        c1.deposita(b1);
        System.out.println(c1);
        
        b1 = new BigDecimal(1000000);
        c1.retira(b1);
        System.out.println(c1);
        
        b1 = new BigDecimal(40000);
        c1.retira(b1);
        
        
        //Cuando ejecutas el método println se ejecuta de manera inherente
        // el método toString... entonces println(c1.toString()) y println(c1)
        // son operaciones equivalentes!
        System.out.println(c1.toString());
        System.out.println(c1);
    }
    
}
