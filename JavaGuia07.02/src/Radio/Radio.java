/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (area = pi ∗ radio2).
e) Método perimetro(): para calcular el perímetro (perimetro = 2 ∗ pi ∗ radio).
 */
package Radio;

import Entidades.Circunferencia;

public class Radio {

    public static void main(String[] args) {
        Circunferencia Circulo = new Circunferencia();
        
        Circulo.crearCircunferencia();

        double radio = Circulo.getRadio();

        System.out.println("El área es igual a: " + Circulo.area(radio));

        System.out.println("El perímetro es igual a: " + Circulo.perimetro(radio));
    }
    
}
