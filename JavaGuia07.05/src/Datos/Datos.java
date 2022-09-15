/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las
operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
 */
package Datos;

import Entidades.Cuenta;
import java.util.Scanner;

public class Datos {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Cuenta c1 = new Cuenta();
        String eleccion = "";
        
        c1.crear();
        System.out.println("");
        
        System.out.println("Se la ingresado la suma de: $" + c1.ingresa() + " pesos.");
        System.out.println("");
        
        do {
            System.out.println("Ingrese la letra:\n" +
                               "R para retirar dinero.\n" +
                               "E para una extraccion rapida.\n" +
                               "S para consultar saldo.\n" +
                               "D para consultar datos.\n" +
                               "X si desea salir.");
            eleccion = leer.nextLine();
            System.out.println("");
            switch (eleccion) {
                case "R":
                    c1.retira();
                    System.out.println("La extraccion ha sido realizada con exito!");
                    break;
                case "E":
                    c1.extraccionRapida();
                    break;
                case "S":
                    c1.consultarSaldo();
                   break;
                case "D":
                    c1.cosultarDatos();
                    break;
            }
            System.out.println("");
        } while (!"X".equals(eleccion.toUpperCase()));
        System.out.println("Gracias por su operacion.");
    }   
}
