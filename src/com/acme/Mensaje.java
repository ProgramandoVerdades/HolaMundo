package com.acme;

import java.util.Scanner;

public class Mensaje {

    public String SoliciDatos (String mensaje){
        System.out.println(mensaje);
        Scanner snc = new Scanner (System.in);
        return snc.nextLine();
    }

    public void saludar(String nombre) {
        System.out.printf("hola %s bienvenido a java \n ",nombre);

    }
}
