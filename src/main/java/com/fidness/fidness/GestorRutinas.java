package com.fidness.fidness;

import java.util.ArrayList;

public class GestorRutinas {

    private static ArrayList<Rutina> rutinas = new ArrayList<>();

    public static void guardarRutina(Rutina rutina) {
        rutinas.add(rutina);
    }

    public static ArrayList<Rutina> obtenerRutinas() {
        return rutinas;
    }
}
