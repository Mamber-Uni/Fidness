package com.fidness.fidness;

public class EjercicioPierna extends Ejercicio {

    public EjercicioPierna(String nombre, String descripcion, String instrucciones) {
        super(nombre, "Pierna", descripcion, instrucciones);
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + "\nZona trabajada: Piernas";
    }
}
