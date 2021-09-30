package com.acme;

public class HolaMundo {

    public static void main(String[] args) {
        Mensaje mjs = new Mensaje ();
        String nombre = mjs.SoliciDatos("Escribe tu Nombre : ");
        mjs.saludar (nombre);

    }
}
