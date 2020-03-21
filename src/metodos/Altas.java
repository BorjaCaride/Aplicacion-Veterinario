/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Date;
import pojos.*;

/**
 *
 * @author Usuario
 */
public class Altas {

    public static void altaAnimal(String reiac, String nombre, String tipo, String alimentacion, String dni) {

        try {
            Animal a = new Animal(reiac, nombre, tipo, alimentacion, dni);

            Variables.Array_animales.add(a);

        } catch (Exception e) {
            System.out.println("Error boton altas");
        }
    }

    public static void altaEmpleado(String dni, String nombre, String apellido, String especialidad, float sueldo, int telefono) {
        try {

            Empleado e = new Empleado(apellido, especialidad, sueldo, telefono, dni, nombre, apellido);

            Variables.Array_empleados.add(e);
            System.out.println("si");

        } catch (Exception e) {
            System.out.println("Error boton altas");
        }
    }

    public static void altaCliente(Date fecha_alta, int telefono, String direccion, String correo, String dni, String nombre, String apellido) {
        try {
            Cliente e = new Cliente(fecha_alta, telefono, direccion, correo, dni, nombre, apellido);

            Variables.Array_clientes.add(e);
            System.out.println("si");

        } catch (Exception e) {
            System.out.println("Error boton altas");
        }

    }

    public static int altaCita(String dni, String reiac, String motivo, Date fechaDate, float precio) {
        try {
            //int id,String dni_cliente, String concepto, String idanimal, Date fecha, float precio)

            Citas c = new Citas(Variables.Array_citas.size() + 1, dni, motivo, reiac, fechaDate, precio);
            Variables.Array_citas.add(c);
        } catch (Exception e) {
            System.out.println("Error alta cita");
        }
        return Variables.Array_citas.size()+1;

    }

}
