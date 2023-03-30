/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class EjemploEskaner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu nombre:");
String nombre = scanner.nextLine();

System.out.println("Escribe tus apellidos:");
String apellidos = scanner.nextLine();

System.out.println("Tu nombre es: " + nombre );
System.out.println("Tus apellidos son: " + apellidos);

System.out.println("Tu nombre completo es: " + nombre +" "+ apellidos);
        // TODO code application logic here
    }
    
}
