package com.fidness.fidness;

import java.util.ArrayList;

public class Datos {

    public static ArrayList<Ejercicio> obtenerEjercicios() {

        ArrayList<Ejercicio> ejercicios = new ArrayList<>();

        ejercicios.add(new EjercicioPierna(
                "Sentadillas",
                "Ejercicio para fortalecer las piernas.",
                "Bajar lentamente flexionando las rodillas y volver a subir."
        ));

        ejercicios.add(new EjercicioPierna(
                "Zancadas",
                "Ejercicio para trabajar las piernas.",
                "Dar un paso hacia adelante, bajar el cuerpo y volver a la posición inicial."
        ));

        ejercicios.add(new EjercicioBrazo(
                "Curl de bíceps",
                "Ejercicio para fortalecer los brazos.",
                "Levantar el peso flexionando los codos y bajar lentamente."
        ));

        ejercicios.add(new EjercicioBrazo(
                "Extensión de tríceps",
                "Ejercicio para trabajar la parte posterior del brazo.",
                "Extender los brazos de forma controlada y volver a la posición inicial."
        ));

        ejercicios.add(new EjercicioEspalda(
                "Remo",
                "Ejercicio para fortalecer la espalda.",
                "Llevar los brazos hacia atrás manteniendo la espalda recta."
        ));

        ejercicios.add(new EjercicioEspalda(
        "Jalón al pecho",
        "Ejercicio para trabajar la espalda.",
        "Jalar la barra hacia el pecho y regresar lentamente."
        ));

        ejercicios.add(new EjercicioPierna(
        "Elevación de talones",
        "Ejercicio para fortalecer las piernas.",
        "Subir lentamente sobre las puntas de los pies y volver a bajar."
        ));

        return ejercicios;
    }
}
