/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import pojos.*;

/**
 *
 * @author Usuario
 */
public class ficheros {

    public static void exportarAnimales() throws IOException {

        ArrayList<Animal> ani = Variables.Array_animales;

        if (ani.isEmpty()) {
            System.out.println("No hay datos de Animales");
        } else {
            FileOutputStream fichero = null;
            fichero = new FileOutputStream("src/ficheros/ListaAnimales.txt");
            ObjectOutputStream tuberia = new ObjectOutputStream(fichero);
            String texto = null;

            for (int i = 0; i != ani.size(); i++) {
                Animal animal = ani.get(i);
                tuberia.writeObject(animal);
            }
            fichero.close();
        }

        /*
        
        //------------- Exporta un arrayLists
        FileOutputStream fichero = null;
        try {

            fichero = new FileOutputStream("src/ficheros/ListaAnimales.txt");
            ObjectOutputStream tuberia = new ObjectOutputStream(fichero);
            System.out.println(Variables.Array_animales.size());
            tuberia.writeObject(Variables.Array_animales);

        } catch (FileNotFoundException e) {

        } finally {
            fichero.close();
        }
         */
    }

    public static void importarAnimales() {

        try {
            Variables.Array_animales.clear();

            Animal a;

            FileInputStream ficheroEntrada = null;
            ficheroEntrada = new FileInputStream("src/ficheros/ListaAnimales.txt");
            ObjectInputStream tuberiaEntrada = new ObjectInputStream(ficheroEntrada);

            while (true) {
                a = (Animal) tuberiaEntrada.readObject();

                Variables.Array_animales.add(a);

            }

        } catch (ClassNotFoundException e) {

        } catch (EOFException e) {
            System.out.println("Leido ListaAnimales.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("No existe ListaAnimales.txt");
        } catch (IOException ex) {
            Logger.getLogger(ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*
        try {
            ArrayList<Animal> animales = new ArrayList<>();
            ficheroEntrada = new FileInputStream("src/ficheros/ListaAnimales.txt");
            ObjectInputStream tuberiaEntrada = new ObjectInputStream(ficheroEntrada);
            animales = (ArrayList<Animal>) tuberiaEntrada.readObject();
            Variables.Array_animales = animales;
        } catch (FileNotFoundException ex) {
            System.out.println("No esta");
        } catch (IOException ex) {
            System.out.println("algo");
        }
         */
    }

    public static void exportarEmpleado() throws IOException {

        FileOutputStream fichero = null;
        fichero = new FileOutputStream("src/ficheros/ListaEmpleados.txt");
        ObjectOutputStream tuberia = new ObjectOutputStream(fichero);

        ArrayList<Empleado> emp = Variables.Array_empleados;

        if (emp.isEmpty()) {
            System.out.println("Vacio");
        } else {

            String texto = null;

            for (int i = 0; i != emp.size(); i++) {
                Empleado empleado = emp.get(i);
                tuberia.writeObject(empleado);
            }

        }

        fichero.close();
        /*
        FileOutputStream fichero = null;
        try {

            fichero = new FileOutputStream("src/ficheros/ListaEmpleados.txt");
            ObjectOutputStream tuberia = new ObjectOutputStream(fichero);
            System.out.println(Variables.Array_empleados.size());
            tuberia.writeObject(Variables.Array_empleados);

        } catch (FileNotFoundException e) {

        } finally {
            fichero.close();
        }/*/
    }

    public static void importarEmpleado() throws ClassNotFoundException {

        try {
            Variables.Array_empleados.clear();

            Empleado e;

            FileInputStream ficheroEntrada = null;
            ficheroEntrada = new FileInputStream("src/ficheros/ListaEmpleados.txt");
            ObjectInputStream tuberiaEntrada = new ObjectInputStream(ficheroEntrada);

            while (true) {
                e = (Empleado) tuberiaEntrada.readObject();

                Variables.Array_empleados.add(e);

            }

        } catch (ClassNotFoundException e) {

        } catch (EOFException e) {
            System.out.println("Leido ListaEmpleados.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("No existe ListaEmpleados.txt");
        } catch (IOException ex) {
            Logger.getLogger(ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* FileInputStream ficheroEntrada = null;
        Empleado e;

        try {
            ArrayList<Empleado> hola = new ArrayList<>();
            ficheroEntrada = new FileInputStream("src/ficheros/ListaEmpleados.txt");
            ObjectInputStream tuberiaEntrada = new ObjectInputStream(ficheroEntrada);
            hola = (ArrayList<Empleado>) tuberiaEntrada.readObject();
            System.out.println(hola.get(0).getNombre() + " S " + hola.get(1).getNombre());
            Variables.Array_empleados = hola;
            System.out.println(Variables.Array_empleados.get(0).getNombre() + " S " + Variables.Array_empleados.get(1).getNombre());

        } catch (FileNotFoundException ex) {
            System.out.println("No esta");
        } catch (IOException ex) {
            System.out.println("algo");
        }*/
    }

    public static void exportarClientes() throws IOException {

        FileOutputStream fichero = null;
        fichero = new FileOutputStream("src/ficheros/ListaClientes.txt");
        ObjectOutputStream tuberia = new ObjectOutputStream(fichero);

        ArrayList<Cliente> cli = Variables.Array_clientes;

        if (cli.isEmpty()) {
            System.out.println("Vacio");
        } else {

            String texto = null;

            for (int i = 0; i != cli.size(); i++) {
                Cliente cliente = cli.get(i);
                tuberia.writeObject(cliente);
            }

        }

        fichero.close();
        /*
        FileOutputStream fichero = null;
        try {

            fichero = new FileOutputStream("src/ficheros/ListaClientes.txt");
            ObjectOutputStream tuberia = new ObjectOutputStream(fichero);
            System.out.println(Variables.Array_clientes.size());
            tuberia.writeObject(Variables.Array_clientes);

        } catch (FileNotFoundException e) {

        } finally {
            fichero.close();
        }*/
    }

    public static void importarClientes() throws ClassNotFoundException {

        try {
            Variables.Array_clientes.clear();

            Cliente c;

            FileInputStream ficheroEntrada = null;
            ficheroEntrada = new FileInputStream("src/ficheros/ListaClientes.txt");
            ObjectInputStream tuberiaEntrada = new ObjectInputStream(ficheroEntrada);

            while (true) {
                c = (Cliente) tuberiaEntrada.readObject();

                Variables.Array_clientes.add(c);

            }

        } catch (ClassNotFoundException e) {

        } catch (EOFException e) {
            System.out.println("Leido ListaClientes.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("No existe ListaClientes.txt");
        } catch (IOException ex) {
            Logger.getLogger(ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }

        /*
        FileInputStream ficheroEntrada = null;
        Empleado e;

        try {
            ArrayList<Cliente> hola = new ArrayList<>();
            ficheroEntrada = new FileInputStream("src/ficheros/ListaClientes.txt");
            ObjectInputStream tuberiaEntrada = new ObjectInputStream(ficheroEntrada);
            hola = (ArrayList<Cliente>) tuberiaEntrada.readObject();
            Variables.Array_clientes = hola;

        } catch (FileNotFoundException ex) {
            System.out.println("No esta");
        } catch (IOException ex) {
            System.out.println("algo");
        }*/
    }

    public static void importarCitas() {

        try {
            Variables.Array_citas.clear();

            Citas c;

            FileInputStream ficheroEntrada = null;
            ficheroEntrada = new FileInputStream("src/ficheros/ListaCitas.txt");
            ObjectInputStream tuberiaEntrada = new ObjectInputStream(ficheroEntrada);

            while (true) {
                c = (Citas) tuberiaEntrada.readObject();

                Variables.Array_citas.add(c);

            }

        } catch (ClassNotFoundException e) {

        } catch (EOFException e) {
            System.out.println("Leido ListaCitas.txt");
        } catch (FileNotFoundException ex) {
            System.out.println("No existe ListaCitas.txt");
        } catch (IOException ex) {
            Logger.getLogger(ficheros.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void exportarCitas() throws IOException {
        FileOutputStream fichero = null;
        fichero = new FileOutputStream("src/ficheros/ListaCitas.txt");
        ObjectOutputStream tuberia = new ObjectOutputStream(fichero);

        ArrayList<Citas> ci = Variables.Array_citas;

        if (ci.isEmpty()) {
            System.out.println("Vacio");
        } else {

            String texto = null;

            for (int i = 0; i != ci.size(); i++) {
                Citas cita = ci.get(i);
                tuberia.writeObject(cita);
            }

        }

        fichero.close();
    }
}
