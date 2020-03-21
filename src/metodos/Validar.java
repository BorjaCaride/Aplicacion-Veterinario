/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import excepciones.Excepciones;

/**
 *
 * @author Usuario
 */
public class Validar {
    public static void validarDNI(String dni) throws Excepciones {
        
        if (dni.length() == 9){
            
            if (dni.substring(0,8).matches("[0-9]*")){
                
                if (!dni.substring(8).matches("[A-Za-z]"))
                    throw new Excepciones("FALLO EN DNI");
                
            }else
                throw new Excepciones("FALLO EN DNI");
            
        }else
            throw new Excepciones("FALLO EN DNI");
        
    }
}
