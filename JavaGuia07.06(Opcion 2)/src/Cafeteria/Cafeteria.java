/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero.
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
 */
package Cafeteria;

import Entidades.Cafetera;
import java.util.Scanner;

public class Cafeteria {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cap = 0, cafe = 0;
        String capacidad = "";
        Cafetera MARTINEZ = new Cafetera();

        System.out.println("Ingresa la letra:\n" +
                                   "L para llenar.\n" + 
                                   "R para rellenar tu taza.\n" +
                                   "V para vaciar.\n" + 
                                   "C para añadir cafecito.\n" +
                                   "S para salir.\n");
        do {
            capacidad = leer.nextLine();

            switch (capacidad.toUpperCase()) {
                case "L":
                    MARTINEZ.llenar();
                    break;

                case "R":
                    do {
                        System.out.println("Cual es la capacidad de tu taza?, tiene que ser menor a 250");
                        cap = leer.nextInt();
                    } while (cap > 250);
                    MARTINEZ.rellenar(cap);
                    break;

                case "V":
                    MARTINEZ.vaciar();
                    break;

                case "C":
                    System.out.println("Cuanto vas a añadir?");
                    cafe = leer.nextInt();
                    MARTINEZ.agregarCafe(cafe);
                    break;
            }
            System.out.println(" ");
        } while (!"S".equals(capacidad.toUpperCase()));
        System.out.println("gracias por visitar la mas mejor cafteria, vuelva pronto.");
    }
}  

