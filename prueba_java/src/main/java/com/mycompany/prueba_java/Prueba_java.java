/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba_java;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Prueba_java {

    public static void main(String[] args) {
        System.out.println("--------CALCULADORA VIRTUAL--------");
        System.out.println("--------SUMA--------");
        Scanner entrada = new Scanner(System.in);
        int a,b,suma;
        System.out.println("ingrese el primer numero:");
        a=entrada.nextInt();
        System.out.println("ingrese el segundo numero:");
        b=entrada.nextInt();
        suma = a+b;
        System.out.println("La suma de ambos numeros es: " + suma);
        
        System.out.println("--------RESTA--------");
        int c,d,resta;
        System.out.println("ingrese el primer numero:");
        c=entrada.nextInt();
        System.out.println("ingrese el segundo numero:");
        d=entrada.nextInt();
        resta = c-d;
        System.out.println("La resta de ambos numeros es: " + resta);
        
        System.out.println("--------DIVICION--------");
        int e,f,divicion;
        System.out.println("ingrese el primer numero:");
        e=entrada.nextInt();
        System.out.println("ingrese el segundo numero:");
        f=entrada.nextInt();
        divicion = e/f;
        System.out.println("La divicion de ambos numeros es: " + divicion);
        
        System.out.println("--------MULTIPLICACION--------");
        int g,h,multiplicacion;
        System.out.println("ingrese el primer numero:");
        g=entrada.nextInt();
        System.out.println("ingrese el segundo numero:");
        h=entrada.nextInt();
        multiplicacion = g*h;
        System.out.println("La multiplicacion de ambos numeros es: " + multiplicacion);
    }
}
