/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Cliente extends Persona implements Serializable{
    private Date fecha_alta;
    private int telefono;
    private String direccion;
    private String correo;

    public Cliente(Date fecha_alta, int telefono, String direccion, String correo, String dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
        this.fecha_alta = fecha_alta;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }

    public Date getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(Date fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
  
    
     //Polimorfismo
    
    public String[] obtenerDatos(){
        
        String dni = super.getDni();
        String nombre = super.getNombre();
        String apellido = super.getApellido();
         String fecha = String.valueOf(new SimpleDateFormat("dd-MM-yyyy").format(this.fecha_alta));
         String telefono = String.valueOf(this.telefono);
         String direccion = String.valueOf(this.direccion);
        String co = this.correo;
        
        String datos[] = {dni,nombre,apellido,fecha,telefono,direccion,co};
        return datos;
    
    }
    
    
}
