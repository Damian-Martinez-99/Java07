
package Entidades;

public class Cafetera {
    private int capacidadMaxima;
    private int capacidadActual;

    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int capacidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.capacidadActual = capacidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(int capacidadActual) {
        this.capacidadActual = capacidadActual;
    }
    
    public void llenarCafetera(){
        capacidadActual = capacidadMaxima;
    }
    
    
    public void servirTaza(int tamanio){
        
        if (capacidadActual >= tamanio){
            System.out.println("La taza se lleno.");
            capacidadActual -= tamanio;
        }
        else {
            System.out.println("Su taza tiene " + capacidadActual + " de " + tamanio);
            capacidadActual = 0;
        }
    }
    
    public void vaciarCafetera(){
        capacidadActual = 0;
    }
    
    public void agregarCafe(int cantidad){
        if (capacidadActual + cantidad <= capacidadMaxima){
            capacidadActual += cantidad;
        }
        else {
            System.out.println("La cantidad ingresada no puede ser agregada porque supera el maximo.");
            capacidadActual = capacidadMaxima;
        }
    }
}

