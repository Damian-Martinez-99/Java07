/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
altura. Se deberán además definir los métodos getters, setters y constructores
correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Calculos;

import Entidades.Rectangulo;

public class Calculos {

    public static void main(String[] args) {
        Rectangulo acutangulo = new Rectangulo();

        acutangulo.datos();
        System.out.println("La superficie del rectangulo es: " + acutangulo.superficie());
        System.out.println("El perimetro del rectangulo es: " + acutangulo.perimetro());  
        acutangulo.forma();
    }
}
