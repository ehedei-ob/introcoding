package main.vehicles;

/**
 * @author {@link "mailto:ehedeidev@gmail.com"}
 */
public class Coche {
    private int numeroPuertas;

    public Coche() {
    }

    public Coche(final int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void sumNumeroPuertas(final int numeroPuertas) {
        this.numeroPuertas += numeroPuertas;
    }

    public void sumNumeroPuertas() {
        this.sumNumeroPuertas(1);
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(final int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "numeroPuertas=" + numeroPuertas +
                '}';
    }
}
