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
public class Empleado extends Persona implements Serializable{
    
    private String especialidad;
    private float sueldo;
    private int telefono;

    public Empleado(String titulo, String especialidad, float sueldo, int telefono, String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.especialidad = especialidad;
        this.sueldo = sueldo;
        this.telefono = telefono;
    }

   

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    //Polimorfismo
    
    public String[] obtenerDatos(){
        
        String nombre = super.getNombre();
        String dni = super.getDni();
        String apellido = super.getApellido();
        String especialidad=this.especialidad;
        String sueldo =String.valueOf(this.sueldo);
        String telefono = String.valueOf(this.telefono);
        
        String datos[] = {dni,nombre,apellido,telefono,sueldo,especialidad};
        return datos;
    
    }
    
    
    
}
