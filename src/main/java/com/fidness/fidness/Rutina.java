package com.fidness.fidness;

import java.util.ArrayList;

public class Rutina {

    private String nombreRutina;
    private ArrayList<Ejercicio> listaEjercicios;

    public Rutina(String nombreRutina) {
        this.nombreRutina = nombreRutina;
        this.listaEjercicios = new ArrayList<>();
    }

    public String getNombreRutina() {
        return nombreRutina;
    }

    public ArrayList<Ejercicio> getListaEjercicios() {
        return listaEjercicios;
    }

    public void agregarEjercicio(Ejercicio ejercicio) {
        listaEjercicios.add(ejercicio);
    }

    public void eliminarEjercicio(Ejercicio ejercicio) {
        listaEjercicios.remove(ejercicio);
    }

    public String mostrarRutina() {

        String texto = "Rutina: " + nombreRutina + "\n\n";

        if (listaEjercicios.isEmpty()) {
            return texto + "No hay ejercicios agregados.";
        }

        for (Ejercicio ejercicio : listaEjercicios) {
            texto += "- " + ejercicio.getNombre()
                    + " (" + ejercicio.getTipo() + ")\n";
        }

        return texto;
    }
}
