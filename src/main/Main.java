package main;

import main.domain.Cliente;
import main.domain.Persona;
import main.domain.Trabajador;

import java.util.Random;

/**
 * @author {@link "mailto:ehedeidev@gmail.com"}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("##### Trabajador #####");

        System.out.println("Generando Trabajador...");
        final Trabajador trabajador = new Trabajador();

        System.out.println("Estado inicial de Trabajador:");
        System.out.println(trabajador);

        System.out.println("Pasamos valores por los setters...");

        trabajador.setEdad(new Random().nextInt(100));
        trabajador.setNombre("Miguel Angel");
        trabajador.setTelefono("+34 111 111 111");
        trabajador.setSalario(9876.54);

        System.out.println(trabajador);

        System.out.println("##### Cliente #####");

        System.out.println("Generando Cliente...");
        final Cliente cliente = new Cliente();

        System.out.println("Estado inicial de Cliente:");
        System.out.println(cliente);

        System.out.println("Pasamos valores por los setters...");

        cliente.setEdad(new Random().nextInt(100));
        cliente.setNombre("Mefisto Feles");
        cliente.setTelefono("+34 666 666 666");
        cliente.setCredito(-666.666);

        System.out.println(cliente);
    }
}