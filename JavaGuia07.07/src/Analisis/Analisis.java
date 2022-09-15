/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad, sexo
('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal, tiene
sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la persona es
mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores.
 */
package Analisis;

import Entidades.Persona;

public class Analisis {

    public static void main(String[] args) {
        Persona P1 = new Persona();
        Persona P2 = new Persona();
        Persona P3 = new Persona();
        Persona P4 = new Persona();
        
        int contadorsobrepeso = 0;
        int contadorpesobajo = 0;
        int contadorpesoideal = 0;
        int contadormayor = 0;
        int contadormenor = 0;
        
        P1.crearPersona();
        P1.calcularIMC();
        System.out.println("Si la persona es mayor, se devolvera true, sino devolvera false: " + P1.mayorEdad());
        float IMC1 = P1.calcularIMC();
            if (IMC1 == -1) {
                contadorpesobajo += 1;
            }
                if (IMC1 == 0) {
                    contadorpesoideal += 1;
                }
                    if (IMC1 == 1) {
                    contadorsobrepeso += 1;
                    }    
        boolean age1 = P1.mayorEdad();
            if (age1== true) {
            contadormayor += 1;
            } else {
                age1 = false;
                contadormenor += 1;
        }
        
        P2.crearPersona();
        P2.calcularIMC();
        System.out.println("Si la persona es mayor, se devolverá true, sino false: " + P2.mayorEdad());
        float IMC2 = P2.calcularIMC();
            if (IMC2 == -1) {
                contadorpesobajo += 1;
            }
                if (IMC2 == 0) {
                    contadorpesoideal += 1;
                }
                    if (IMC2 == 1) {
                    contadorsobrepeso += 1;
                    }    
        boolean age2 = P2.mayorEdad();
            if (age2== true) {
            contadormayor += 1;
            } else {
                age2 = false;
                contadormenor += 1;
            }
            
        P3.crearPersona();
        P3.calcularIMC();
        System.out.println("Si la persona es mayor, se devolverá true, sino false: " + P3.mayorEdad());
        float IMC3 = P3.calcularIMC();
            if (IMC3 == -1) {
                contadorpesobajo += 1;
            }
                if (IMC3 == 0) {
                    contadorpesoideal += 1;
                }
                    if (IMC3 == 1) {
                    contadorsobrepeso += 1;
                    }    
        boolean age3 = P3.mayorEdad();
            if (age3== true) {
            contadormayor += 1;
            } else {
                age3 = false;
                contadormenor += 1;
            }
        
        P4.crearPersona();
        P4.calcularIMC();
        System.out.println("Si la persona es mayor, se devolverá true, sino false: " + P4.mayorEdad());
        float IMC4 = P4.calcularIMC();
            if (IMC4 == -1) {
                contadorpesobajo += 1;
            }
                if (IMC4 == 0) {
                    contadorpesoideal += 1;
                }
                    if (IMC4 == 1) {
                    contadorsobrepeso += 1;
                    }    
        boolean age4 = P4.mayorEdad();
            if (age4== true) {
            contadormayor += 1;
            } else {
                age4 = false;
                contadormenor += 1;
        }
            
        System.out.println("La cantidad de persona que tienen un peso bajo son: " + contadorpesobajo);
        System.out.println("La cantidad de personas que tienen un peso ideal son: " + contadorpesoideal);
        System.out.println("La cantidad de personas que tienen un sobre peso son: " + contadorsobrepeso + "\n");
        System.out.println("La cantidad de personas mayores de edad son: " + contadormayor + ", y las personas menores de edad son: " + contadormenor);
    }
}
