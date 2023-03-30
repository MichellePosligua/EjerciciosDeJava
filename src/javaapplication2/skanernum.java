/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class skanernum {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);

System.out.println("Escribe un número: ");

int valorNumero1 = Integer.parseInt(consola.nextLine());
//tranforma una cadena introducida por el usuario a un número entero

System.out.println("Escribe otro número: ");

int valorNumero2 = Integer.parseInt(consola.nextLine());

int suma = valorNumero1 + valorNumero2;

System.out.println("La suma es: " + suma);
        
    }
    
}
