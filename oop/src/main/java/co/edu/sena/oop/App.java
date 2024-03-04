package co.edu.sena.oop;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner scr = new Scanner(System.in);
        double numero1 = 0;
        double numero2 = 0;
        double numero3 = 0;
        double numero4 = 0;

        Data data = new Data();
        
        System.out.println("Miscelanea de Ejercicios OOP Java");
        System.out.println("---------------------------------");
        System.out.println("Menú Principal");
        System.out.println("1. Operadores");
        System.out.println("2. Condicionales");
        System.out.println("3. Ciclos");
        System.out.println("4. Arreglos");
        System.out.println("99. Salir");

        //submenú operadores
        System.out.println("Categoria Operadores");
        System.out.println("1. Calcular Área Triangulo");
        System.out.println("2. Sumar dos números");
        System.out.println("3. Elevar un número al cuadrado");
        System.out.println("4. Convertir euros a dólares");
        System.out.println("5. Hallar el área y perimetro de un cuadrado");
        System.out.println("6. Hallar el área y volúmen de un cilindro");
        System.out.println("7. Hallar el área y longitud de un circulo");
        System.out.println("8. Calcular promedio");

        System.out.println("------------------------------");
        System.out.println("1. Calcular el área de un triangulo");
        System.out.println("Ingresar la base:");
        numero1 = scr.nextDouble();
        System.out.println("Ingrese la altura");
        numero2 = scr.nextDouble();
        System.out.println("El area del triangulo es : " + data.areaTriangulo(numero1, numero2));

        System.out.println("------------------------------");
        System.out.println("2. Sumar dos números");
        System.out.println("Ingrese número:");
        numero3 = scr.nextDouble();
        System.out.println("Ingrese número");
        numero4 = scr.nextDouble();
        System.out.println("La suma del número es : " + data.sumanumeros(numero3, numero4));

        System.out.println("------------------------------");
        System.out.println("3. Elevar un número al cuadrado");
        System.out.println("Ingrese número:");
        numero1 = scr.nextDouble();
        System.out.println("El resultado es : " + data.elevarcuadrado(numero1));
        
    }
}
