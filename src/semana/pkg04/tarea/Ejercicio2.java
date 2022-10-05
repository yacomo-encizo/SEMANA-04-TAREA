/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana.pkg04.tarea;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Ejercicio2 {
    
public static void main(String[] args) {
        double area, radio;
        Scanner num = new Scanner(System.in);
        try {
            System.out.print("Introduce el radio de un Círculo: ");
            radio = num.nextDouble();
            area = Math.PI*(radio*radio);
            System.out.println("El área del Círculo es: " + area);
        } catch (Exception e) {
        }        
    }
}
