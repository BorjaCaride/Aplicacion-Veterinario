/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.io.Serializable;

/**
 *
 * @author Usuario
 */
public class Animal implements Serializable {
    private String REIAC;
    private String nombre;
    private String tipo_animal;
    private String alimentacion;
    private String dni_dueño;

    public Animal(String REIAC, String nombre, String tipo_animal, String alimentacion, String dni_dueño) {
        this.REIAC = REIAC;
        this.nombre = nombre;
        this.tipo_animal = tipo_animal;
        this.alimentacion = alimentacion;
        this.dni_dueño = dni_dueño;
    }

    public String getREIAC() {
        return REIAC;
    }

    public void setREIAC(String REIAC) {
        this.REIAC = REIAC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo_animal() {
        return tipo_animal;
    }

    public void setTipo_animal(String tipo_animal) {
        this.tipo_animal = tipo_animal;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public String getDni_dueño() {
        return dni_dueño;
    }

    public void setDni_dueño(String dni_dueño) {
        this.dni_dueño = dni_dueño;
    }

    public String[] obtenerDatos() {
        
        String reiac = this.REIAC;
        String nombre = this.nombre;
        String tipo = this.tipo_animal;
        String alimentacion = this.alimentacion;
        String dueño = this.dni_dueño;
        
        
        String datos[] = {reiac,nombre,tipo,alimentacion,dueño};
        
        return datos; }
    
    
    
    
}
