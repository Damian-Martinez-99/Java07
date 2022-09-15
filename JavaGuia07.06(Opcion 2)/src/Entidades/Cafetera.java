
package Entidades;

public class Cafetera {
    private int capacidadMax = 250;
    private int capacidadActual = 100;

    public Cafetera() {
    }

    public Cafetera(int capacidadMax, int capacidadActual) {
        this.capacidadMax = capacidadMax;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public void llenar() {
        capacidadActual = capacidadMax;
        System.out.println("la cafetera esta a su maximo," + capacidadMax + " ml.");
    }

    public void vaciar() {
        capacidadActual = 0;
        System.out.println("la cafetera esta vacia.");
    }

    public void rellenar(int cap) {
        if (cap > capacidadActual) {
            System.out.println("no hay suficiente cafe, tu taza no se lleno, solo se rellenaron " + capacidadActual + " ml");
            capacidadActual = 0;
        } else {
            System.out.println("Tu taza se lleno exitosamente, con " + cap + " ml");
            capacidadActual -= cap;
        }
    }

    public void agregarCafe(int cafe) {
        capacidadActual += cafe;
        if (capacidadActual > capacidadMax) {
            System.out.println("el cafe se añadio, pero se rebalso, tiene 250 ml ahora, la capacidad maxima.");
            capacidadActual = capacidadMax;
        } else {
            System.out.println("se añadieron los " + cafe + " ml exitosamente, la cantidad de cafe ahora es " + capacidadActual);
        }
    }
}
