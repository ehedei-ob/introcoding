package main;

import main.domain.Persona;

import java.util.Random;

/**
 * @author {@link "mailto:ehedeidev@gmail.com"}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Generando Persona...");
        final Persona persona = new Persona();

        System.out.println("Estado inicial de persona:");
        System.out.println(persona);

        System.out.println("Pasamos valores por los setters...");

        persona.setEdad(new Random().nextInt(100));
        persona.setNombre("Mefisto Feles");
        persona.setTelefono("+34 666 666 666");

        System.out.println(String.format("Nombre de la persona: %s", persona.getNombre()));
        System.out.println(String.format("Edad de la persona: %d", persona.getEdad()));
        System.out.println(String.format("Telefono de la persona: %s", persona.getTelefono()));
        System.out.println(persona);


    }
}