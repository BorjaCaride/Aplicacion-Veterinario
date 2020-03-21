/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.ArrayList;
import java.util.Date;
import static metodos.Bajas.bajaAnimalesCli;
import static metodos.Bajas.bajaCitasCli;
import pojos.Animal;
import pojos.Citas;
import pojos.Cliente;
import pojos.Empleado;

/**
 *
 * @author Usuario
 */
public class Modificar {

    public static void modificarCli(String dni, String nombre, String apellido, String direccion, int telefono, Date fechaDate, String correo) {

        ArrayList<Cliente> cli = Variables.Array_clientes;

        if (cli.isEmpty()) {
            System.out.println("Vacio");
        } else {

            String texto = null;

            for (int i = 0; i < cli.size(); i++) {
                Cliente cliente = cli.get(i);
                if (cliente.getDni().equalsIgnoreCase(dni)) {
                    cliente.setNombre(nombre);
                    cliente.setApellido(apellido);
                    cliente.setDireccion(direccion);
                    cliente.setTelefono(telefono);
                    cliente.setFecha_alta(fechaDate);
                    cliente.setCorreo(correo);

                    break;
                }
            }
        }

    }

    public static void modificarEmpleado(String dni, String nombre, String apellido, String especialidad, float s, int t) {
        ArrayList<Empleado> emp = Variables.Array_empleados;

        if (emp.isEmpty()) {
            System.out.println("Vacio");
        } else {

            String texto = null;

            for (int i = 0; i != emp.size(); i++) {
                Empleado empleado = emp.get(i);
                if (empleado.getDni().equalsIgnoreCase(dni)) {
                    empleado.setDni(dni);
                    empleado.setNombre(nombre);
                    empleado.setApellido(apellido);
                    empleado.setEspecialidad(especialidad);
                    empleado.setSueldo(s);
                    empleado.setTelefono(t);
                    break;
                }

            }
        }

    }

    public static void modificarAnimal(String reiac, String nombre, String tipo, String alimentacion, String dni) {
   
     ArrayList<Animal> ani = Variables.Array_animales;

        if (ani.isEmpty()) {
            System.out.println("Vacio");
        } else {

            String texto = null;

            for (int i = 0; i != ani.size(); i++) {
                Animal animal = ani.get(i);
                if (animal.getREIAC().equalsIgnoreCase(reiac)) {
                    animal.setNombre(nombre);
                    animal.setTipo_animal(tipo);
                    animal.setAlimentacion(alimentacion);
                    animal.setDni_dueño(dni);
                    break;
                }

            }
        }
    
    
    }

    public static void modificarCita(int id, String dni, String reiac, String motivo, Date fechaDate, float p) {
    
    ArrayList<Citas> ci = Variables.Array_citas;

        if (ci.isEmpty()) {
            System.out.println("Vacio");
        } else {

            String texto = null;

            for (int i = 0; i != ci.size(); i++) {
                Citas cita = ci.get(i);
                if (cita.getId()==id) {
                    cita.setDni_cliente(dni);
                    cita.setIdanimal(reiac);
                    cita.setConcepto(motivo);
                    cita.setFecha(fechaDate);
                    cita.setPrecio(p);
                    break;
                }

            }
        }
    
    
    }

}
