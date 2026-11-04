package com.fidness.fidness;

public class Usuario {

    private String nombre;
    private String nombreUsuario;
    private String contrasena;

    public Usuario(String nombre, String nombreUsuario, String contrasena) {
        this.nombre = nombre;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public boolean iniciarSesion(String usuario, String clave) {
        return nombreUsuario.equals(usuario) && contrasena.equals(clave);
    }
}
