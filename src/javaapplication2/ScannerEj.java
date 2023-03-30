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
public class ScannerEj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lee la entrada del usuario y lo almacena en la variable scanner
Scanner scanner = new Scanner(System.in);

// Solicita el mensaje
System.out.println("Introduce un mensaje: ");

//Lee la cadena escrita por el usuario y lo asigna a la variable mensaje
String mensaje = scanner.nextLine(); //nextLine lee una linea completa

// Imprime el mensaje introducido por el usuario
System.out.println("Tu mensaje es: "+mensaje);
        // TODO code application logic here
    }
    
}
