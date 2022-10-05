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
public class Ejercicio6 {
    
public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Primer Número: ");
       int num1 = sc.nextInt();
       System.out.print("Segundo número: ");
       int num2 = sc.nextInt();
       int x = num1 % num2;
        if (x==0) {
            System.out.println("El resultado es múltiplo");
            
        }
        else {
            System.out.println("El resutado no es múltiplo");
        }
}
}