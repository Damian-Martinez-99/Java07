
package Entidades;

import java.util.Scanner;

public class Persona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private int edad;
    private String genero;
    private float peso;
    private float altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String genero, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void crearPersona() {
        System.out.print("ingrese su nombre: ");
        nombre = leer.next();
        System.out.print("ingrese su edad: ");
        edad = leer.nextInt();
        System.out.println("");
        do {
            System.out.println("ingresa la letra:\n" +
                               "H si sos hombre.\n" + 
                               "M si sos mujer.\n" + 
                               "O si sos no binarie.");
            genero = leer.next();
            if (!"H".equalsIgnoreCase(genero) && !"M".equalsIgnoreCase(genero) && !"O".equalsIgnoreCase(genero)) {
               System.out.println("La letra que introdujo no es correcta, por favor ingrese una letra correcta.");
            }
        } while (!"H".equalsIgnoreCase(genero) && !"M".equalsIgnoreCase(genero) && !"O".equalsIgnoreCase(genero));
        System.out.println("");
        System.out.print("Ingrese su peso en kg: ");
        peso = leer.nextFloat();
        System.out.print("Ingrese su altura en metros: ");
        altura = leer.nextFloat();
    }
    
    public int calcularIMC() {
        int respuesta = 0;
        double IMC = peso / Math.pow(altura, 2);
        if (IMC < 20 && IMC >= 0) {
            System.out.println("La persona esta por debajo de su peso ideal.");
            respuesta = -1;
        } else if (IMC >= 20 && IMC <= 25) {
            System.out.println("La persona esta en su peso ideal :D");
            respuesta = 0;
        } else if (IMC > 25) {
            System.out.println("Estas rellenito.");
            respuesta = 1;
        }
        System.out.println("");
        return respuesta;
    }
    
    public boolean mayorEdad(){
        return edad >= 18;        
    }
}
