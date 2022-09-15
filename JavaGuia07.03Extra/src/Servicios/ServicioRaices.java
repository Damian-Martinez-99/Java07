
package Servicios;

import Entidades.Raices;
import java.util.Scanner;

public class ServicioRaices {
    
    public Raices CrearRaices(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer valor");
        int valor1 = leer.nextInt();
        System.out.println("Ingrese el segundo valor");
        int valor2 = leer.nextInt();
        System.out.println("Ingrese el tercer valor");
        int valor3 = leer.nextInt();
        return new Raices(valor1, valor2, valor3);
    }
    
    public double getDiscriminante (Raices Coef) {
        double respuesta = Math.pow(Coef.getB(), 2) - 4 * Coef.getA() * Coef.getC();
        return respuesta;
}
    public boolean tieneRaices (Raices Coef) {
        boolean respuesta = false;
        double Operacion = Math.pow(Coef.getB(), 2) - 4 * Coef.getA() * Coef.getC();
        if (Operacion >= 0) {
            respuesta = true;
        }
        return respuesta;
    }
    
    public boolean tieneRaiz (Raices Coef) {
        boolean respuesta = false;
        double Operacion = Math.pow(Coef.getB(), 2) - 4 * Coef.getA() * Coef.getC();
        if (Operacion == 0) {
            respuesta = true;
        }
        return respuesta;
    }
    
    public void obtenerRaices (Raices Coef) {
        if (tieneRaices(Coef) == true){
            int a = Coef.getA();
            int b = Coef.getB();
            int c = Coef.getC();
            
            double solucion1 = (-b + Math.sqrt((Math.pow(b, 2)-(4*a*c)))/(2*a));
            double solucion2 = (-b - Math.sqrt((Math.pow(b, 2)-(4*a*c)))/(2*a));
            
            System.out.println("La solucion 1 es igual a: " + solucion1 + ", La solucion 2 es igual a: " + solucion2);
        } else { 
            System.out.println("No pudimos realizar una doble solucion.");
        } 
    }
    
    public void obtenerRaiz (Raices Coef) {
        if (tieneRaiz(Coef) == true){
            int a = Coef.getA();
            int b = Coef.getB();
            int c = Coef.getC();
            
            double solucion1 = (-b + Math.sqrt((Math.pow(b, 2)-(4*a*c)))/(2*a));
            double solucion2 = (-b - Math.sqrt((Math.pow(b, 2)-(4*a*c)))/(2*a));
            
            System.out.println("La solucion 1 es igual a: " + solucion1 + ", La solucion 2 es igual a: " + solucion2);
        } else { 
            System.out.println("No pudimos realizar una doble solucion.");
        } 
    }
}
