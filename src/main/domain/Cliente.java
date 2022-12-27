package main.domain;

/**
 * @author {@link "mailto:ehedeidev@gmail.com"}
 */
public class Cliente extends Persona {
    private double credito;

    public double getCredito() {
        return credito;
    }

    public void setCredito(final double credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", telefono='" + telefono + '\'' +
                ", credito=" + credito +
                '}';
    }
}
