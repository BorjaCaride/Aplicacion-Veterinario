/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.ArrayList;
import pojos.*;

/**
 *
 * @author Usuario
 */
public class Bajas {
    public static void bajaEmpleado(String dni){
        ArrayList<Empleado> emp = Variables.Array_empleados;

        if (emp.isEmpty()) {
            System.out.println("Vacio");
        } else {

            String texto = null;

            for (int i = 0; i < emp.size(); i++) {
                Empleado empleado = emp.get(i);
                if(empleado.getDni().equalsIgnoreCase(dni)){
                
                Variables.Array_empleados.remove(empleado);
                break;
                }
            }
        }
        
        
    } 

    public static void bajaCliente(String dni) {
       ArrayList<Cliente> cli = Variables.Array_clientes;

        if (cli.isEmpty()) {
            System.out.println("Vacio");
        } else {

            String texto = null;

            for (int i = 0; i < cli.size(); i++) {
                Cliente cliente = cli.get(i);
                if(cliente.getDni().equalsIgnoreCase(dni)){
                
                Variables.Array_clientes.remove(cliente);
                    bajaAnimalesCli(dni);
                    bajaCitasCli(dni);
                break;
                }
            }
        }
    }
    public static void bajaAnimalesCli(String dni){
    
    ArrayList<Animal> ani = Variables.Array_animales;

    
        if (ani.isEmpty()) {
            System.out.println("Vacio");
        } else {

            for (int i = 0; i < Variables.Array_animales.size(); i++) {
                Animal animal = ani.get(i);
                if(animal.getDni_dueño().equalsIgnoreCase(dni)){
                
                ani.remove(animal);
                }
            }
            Variables.Array_animales = ani;
        }
    
    }
    
    public static void bajaCitasCli(String dni){
        ArrayList<Citas> c = Variables.Array_citas;

        if (c.isEmpty()) {
            System.out.println("Vacio");
        } else {

            String texto = null;

            for (int i = 0; i < c.size(); i++) {
                Citas citas = c.get(i);
                if(citas.getDni_cliente().equalsIgnoreCase(dni)){
                Variables.Array_citas.remove(citas);
                }
            }
        }
        
    }

    public static void bajaAnimal(String reiac) {
        
     ArrayList<Animal> c = Variables.Array_animales;

        if (c.isEmpty()) {
            System.out.println("Vacio");
        } else {

            String texto = null;

            for (int i = 0; i < c.size(); i++) {
                Animal animal = c.get(i);
                if(animal.getREIAC().equalsIgnoreCase(reiac)){
                Variables.Array_animales.remove(animal);
                }
            }
        }
    
    }

    public static void bajaCita(int id) {
      ArrayList<Citas> c = Variables.Array_citas;

        if (c.isEmpty()) {
            System.out.println("Vacio");
        } else {

            String texto = null;

            for (int i = 0; i < c.size(); i++) {
                Citas cita = c.get(i);
                if(cita.getId()==id){
                Variables.Array_citas.remove(cita);
                }
            }
        }
    
    }
}
