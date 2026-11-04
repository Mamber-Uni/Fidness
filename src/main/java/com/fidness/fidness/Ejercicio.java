package com.fidness.fidness;

public class Ejercicio {

    protected String nombre;
    protected String tipo;
    protected String descripcion;
    protected String instrucciones;

    public Ejercicio(String nombre, String tipo, String descripcion, String instrucciones) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.instrucciones = instrucciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public String mostrarInformacion() {
        return "Nombre: " + nombre
                + "\nTipo: " + tipo
                + "\nDescripción: " + descripcion
                + "\nInstrucciones: " + instrucciones;
    }
}
