/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Citas implements Serializable {

    private int id;
    private String dni_cliente;
    private String concepto;
    private String idanimal;
    private Date fecha;
    private float precio;

    public Citas(int id, String dni_cliente, String concepto, String idanimal, Date fecha, float precio) {
        this.id = id;
        this.dni_cliente = dni_cliente;
        this.concepto = concepto;
        this.idanimal = idanimal;
        this.fecha = fecha;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(String dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getIdanimal() {
        return idanimal;
    }

    public void setIdanimal(String idanimal) {
        this.idanimal = idanimal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String[] obtenerDatos() {

        int id = this.id;
        String dni = this.dni_cliente;
        String concepto = this.concepto;
        String reiac = this.idanimal;
        String fecha = String.valueOf(new SimpleDateFormat("dd-MM-yyyy").format(this.fecha));
        float precio = this.precio;

        String datos[] = {String.valueOf(id), dni, reiac, concepto,fecha,String.valueOf(precio)};

        return datos;

    }

}
