
package Entidades;

import java.util.Scanner;

public class Cuenta {
    private int numCuenta;
    private double saldo;
    private long dni;
    private String nombre;

    public Cuenta() {
    }

    public Cuenta(double ingreso, String nombre, int numCuenta, int saldo, long dni) {
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.dni = dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public long getDni() {
        return dni;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    
    public void crear() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.print("Ingrese su nombre: ");
        nombre = leer.nextLine();
        System.out.print("Ingrese su DNI: ");
        dni = leer.nextLong();
        numCuenta = (int) (Math.random() * 99999);
        System.out.println("Bienvenido " + nombre + ", su numero de cuenta es: " + numCuenta + " ,y su saldo es: " + saldo);
    }

    double ingreso = Math.random()*9999;
    public double ingresa() {
        return saldo += ingreso;
    }
    
    public Double retira() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la suma que desea retirar: ");
        double retiro = leer.nextDouble();
        return saldo -= retiro;
    }
    
    public Double extraccionRapida(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Puede retirar hasta un 20% de su saldo, ingrese un monto que desea retirar en este momento: ");
        double retir = leer.nextDouble();
        while (retir > this.saldo * 0.2){
            System.out.println("El monto que desea retirar no esta dentro del 20%, por favor, ingrese nuevamente un monto menor: ");
            retir  =leer.nextDouble();
        }
        return saldo -= retir;
    }
    public void consultarSaldo(){
        System.out.println("Su saldo es: " + this.saldo);
    }
    public void cosultarDatos(){
            System.out.println("El nombre del titular de la cuenta es: " + this.nombre + "\n" + "El numero de cuenta es: " + this.numCuenta + "\n" + "El DNI de la cuenta es: " + this.dni + "\n" + "El saldo actual de la cuenta es: " + this.saldo);
    }
}

