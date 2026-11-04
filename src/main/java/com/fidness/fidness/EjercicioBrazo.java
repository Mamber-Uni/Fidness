package com.fidness.fidness;

public class EjercicioBrazo extends Ejercicio {

    public EjercicioBrazo(String nombre, String descripcion, String instrucciones) {
        super(nombre, "Brazo", descripcion, instrucciones);
    }

    @Override
    public String mostrarInformacion() {
        return super.mostrarInformacion()
                + "\nZona trabajada: Brazos";
    }
}
