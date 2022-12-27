package main;

import java.util.Random;

/**
 * @author {@link "mailto:ehernandez@eturia.es"}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("##### If #####\n");

        final int numeroIf = new Random().nextInt();

        if (numeroIf > 0) {
            System.out.println(String.format("%d es positivo", numeroIf));
        } else if (numeroIf < 0) {
            System.out.println(String.format("%d es negativo", numeroIf));
        } else {
            System.out.println(String.format("El número es cero"));
        }

        System.out.println("\n\n##### While #####\n");

        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(String.format("Iteración con número: %d [While]", numeroWhile));
            numeroWhile++;
        }


        System.out.println("\n\n##### Do While #####\n");

        do {
            System.out.println(String.format("Iteración con número: %d [Do While]", numeroWhile));
            numeroWhile++;
        } while (numeroWhile < 3);

        System.out.println("\n\n##### For #####\n");

        for (int i = 0; i <= 3; i++) {
            System.out.println(String.format("Iteración con número: %d [For]", i));
        }


        System.out.println("\n\n##### Switch #####\n");

        final String[] estaciones = {"verano", "primavera", "otoño", "invierno", "otra_cosa"};
        final String estacion = estaciones[new Random().nextInt(estaciones.length)];

        switch (estacion) {
            case "verano":
                System.out.println("La estación es Verano");
                break;
            case "otoño":
                System.out.println("La estación es Otoño");
                break;
            case "invierno":
                System.out.println("La estación es Invierno");
                break;
            case "primavera":
                System.out.println("La estación es Primavera");
                break;
            default:
                System.out.println("No ha insertado una estación válida");

        }

    }
}