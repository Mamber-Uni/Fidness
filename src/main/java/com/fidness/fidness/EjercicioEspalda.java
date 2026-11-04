package com.fidness.fidness;

public class EjercicioEspalda extends Ejercicio {

    public EjercicioEspalda(String nombre, String descripcion, String instrucciones) {
        super(nombre, "Espalda", descripcion, instrucciones);
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + "\nZona trabajada: Espalda";
    }
}
