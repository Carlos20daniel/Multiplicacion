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
        //INSERTAMOS UNA LIBRERIA PARA USAR LA CONSOLA
        Scanner entrada = new Scanner(System.in);
        //CREAMOS LAS VARIABLES A USAR PARA LOS DATOS
        int a,b,suma;
        //INGRESAMOS EL PRIMER NUMERO A SUMAR
        System.out.println("Digite el primer numero:");
        a=entrada.nextInt();
        //INGRESAMOS EL SEGUNDO NUMERO A SUMAR
        System.out.println("Digite el segundo numero:");
        b=entrada.nextInt();
        //CREAMOS LA VARIABLE QUE SUMARA LOS DATOS
        suma = a+b;
        //SALIDA DE LOS DATOS INGRESADOS Y SU RESULTADO
        System.out.println("EL RESULTADO DE ESTA SUMA ES: " + suma);
        
        System.out.println("-----------------------------------");
        
        System.out.println("--------RESTA--------");
        //CREAMOS LAS VARIABLES A USAR PARA LOS DATOS
        int c,d,resta;
        //INGRESAMOS EL PRIMER NUMERO A RESTAR
        System.out.println("Digite el primer numero:");
        c=entrada.nextInt();
        //INGRESAMOS EL SEGUNDO NUMERO A RESTAR
        System.out.println("Digite el segundo numero:");
        d=entrada.nextInt();
        //CREAMOS LA VARIABLE QUE RESTARA LOS DATOS
        resta = c-d;
        //SALIDA DE LOS DATOS INGRESADOS Y SU RESULTADO
        System.out.println("EL RESULTADO DE ESTA RESTA ES: " + resta);
        
        System.out.println("-----------------------------------");

        
        System.out.println("--------DIVICION--------");
        //CREAMOS LAS VARIABLES A USAR PARA LOS DATOS
        int e,f,divicion;
        //INGRESAMOS EL PRIMER NUMERO A DIVIDIR
        System.out.println("Digite el primer numero:");
        e=entrada.nextInt();
        //INGRESAMOS EL SEGUNDO NUMERO A DIVIDIR
        System.out.println("Digite el segundo numero:");
        f=entrada.nextInt();
        //CREAMOS LA VARIABLE QUE DIVIDIRA LOS DATOS
        divicion = e/f;
        //SALIDA DE LOS DATOS INGRESADOS Y SU RESULTADO
        System.out.println("EL RESULTADO DE ESTA DIVICION ES:  " + divicion);
        
        System.out.println("-----------------------------------");

        
        System.out.println("--------MULTIPLICACION--------");
        //CREAMOS LAS VARIABLES A USAR PARA LOS DATOS
        int g,h,multiplicacion;
        //INGRESAMOS EL PRIMER NUMERO A MULTIPLICAR
        System.out.println("Digite el primer numero:");
        g=entrada.nextInt();
        //INGRESAMOS EL SEGUNDO NUMERO A MULTIPLICAR
        System.out.println("Digite el segundo numero:");
        h=entrada.nextInt();
        //CREAMOS LA VARIABLE QUE MULTIPLICARA LOS DATOS
        multiplicacion = g*h;
        //SALIDA DE LOS DATOS INGRESADOS Y SU RESULTADO
        System.out.println("EL RESULTADO DE ESTA MULTIPLICACION ES:  " + multiplicacion);
    }
}
