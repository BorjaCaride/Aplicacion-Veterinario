/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;
import pojos.Animal;
import pojos.Citas;
import pojos.Cliente;
import pojos.Empleado;
import pojos.Persona;

/**
 *
 * @author Usuario
 */
public class Cargar {

    public static void cargaEmpleado(DefaultTableModel modelo) {

        ArrayList<Empleado> emp = Variables.Array_empleados;

        if (emp.isEmpty()) {
            System.out.println("Vacio");
        } else {

            String texto = null;

            for (int i = 0; i != emp.size(); i++) {
                Empleado empleado = emp.get(i);
                String[] fila = empleado.obtenerDatos();
                modelo.addRow(fila);
            }
        }
    }

    public static void cargaClientes(DefaultTableModel modelo) {

        ArrayList<Cliente> cli = Variables.Array_clientes;

        if (cli.isEmpty()) {
            System.out.println("Vacio");
        } else {

            String texto = null;

            for (int i = 0; i != cli.size(); i++) {
                Cliente cliente = cli.get(i);
                String[] fila = cliente.obtenerDatos();
                System.out.println(fila);
                modelo.addRow(fila);
                
            }
        }
    }
    
    public static void cargaTablaAnimales(DefaultTableModel modelo){
    ArrayList<Animal> cli = Variables.Array_animales;

        if (cli.isEmpty()) {
            System.out.println("Vacio");
        } else {

            String texto = null;

            for (int i = 0; i != cli.size(); i++) {
                Animal animal = cli.get(i);
                String[] fila = animal.obtenerDatos();
                modelo.addRow(fila);
            }
        }
    
    }
     public static void cargaTablaCitas(DefaultTableModel modelo) {
      ArrayList<Citas> ci = Variables.Array_citas;

      
        if (ci.isEmpty()) {
            System.out.println("Vacio");
        } else {

            String texto = null;

            for (int i = 0; i != ci.size(); i++) {
                Citas cita = ci.get(i);
                String[] fila =cita.obtenerDatos();
                modelo.addRow(fila);
            }
        }
    
    
    }

    public static void cargaComboDueño(JComboBox<String> ComboBox) {

        ArrayList<Cliente> cli = Variables.Array_clientes;

        if (cli.isEmpty()) {
            System.out.println("Vacio");
        } else {

            String texto = null;

            for (int i = 0; i != cli.size(); i++) {
                Cliente cliente = cli.get(i);
                ComboBox.addItem(cliente.getDni().toString());
            }
        }

    }
    
    
    
    public static void cargaComboAnimalesDueño(JComboBox<String> ComboBox,String dni){
   
        ComboBox.removeAllItems();
        if (Variables.Array_animales.isEmpty()){
        
            System.out.println("Vacio");
        }else{
        
        for (int i =0; i!=Variables.Array_animales.size();i++){
            Animal ani = Variables.Array_animales.get(i);
            
            if(ani.getDni_dueño().equalsIgnoreCase(dni)){
            ComboBox.addItem(ani.getREIAC());
            }
        
        }
        }
    
    }

   

   
}
