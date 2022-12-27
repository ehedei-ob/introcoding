package main;

import main.vehicles.Coche;

/**
 * @author {@link "mailto:ehedeidev@gmail.com"}
 */
public class Main {
    public static int sumThreeNumbers(final int num1, final int num2, final int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String[] args) {
        System.out.println("###### Primera Parte #####\n");

        final int num1 = 1;
        final int num2 = 34;
        final int num3 = 4;
        final int result = sumThreeNumbers(num1, num2, num3);
        System.out.println(String.format("El resultado de sumar %d, %d y %d es %d", num1, num2, num3, result ));


        System.out.println("\n\n###### Segunda Parte #####\n");
        System.out.println("Generamos coche...");
        final Coche miCoche = new Coche();
        System.out.println(miCoche);
        final int puertas = 3;
        System.out.println(String.format("Añadimos %d puertas...", puertas));
        miCoche.sumNumeroPuertas(puertas);
        System.out.println(miCoche);

    }
}