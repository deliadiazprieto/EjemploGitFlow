package com.ufv.ejemplo02;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {

        //Creamos un objeto de la clase persona
        Persona p = new Persona();
        p.setEdad(-1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        //String cadena = sc.nextLine(); //Leer lo que se escribe por pantalla
        //System.out.println(cadena);
        p.setNombre(sc.nextLine());
        System.out.println("Introduce tus apellidos: ");
        p.setApellidos(sc.nextLine());
        System.out.println("Introduce tu DNI sin letra: ");
        p.setDniSinLetra(Integer.parseInt(sc.nextLine()));
        System.out.println("Introduce tu edad: ");
        p.setEdad(Integer.parseInt(sc.nextLine()));

        System.out.println("Buenos días: " + p.getNombre());
        System.out.println(" " +p.getApellidos() + " con DNI " + p.getDniSinLetra());
        System.out.println(" y edad " + p.getEdad());

    }

}
