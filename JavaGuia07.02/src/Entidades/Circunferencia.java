
package Entidades;

import java.util.Scanner;

public class Circunferencia {
     private double radio;

    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void crearCircunferencia() {
        System.out.println("Ingresa el radio");
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        this.radio = leer.nextDouble();
    }

    public double area(double radio) {
        return Math.PI * Math.pow (radio,2);
    }

    public double perimetro(double radio) {
        return 2 * radio * Math.PI;
    }

    @Override
    public String toString() {
        return "Circunferencia: " + "[Radio = " + radio + "]";
    }
}
