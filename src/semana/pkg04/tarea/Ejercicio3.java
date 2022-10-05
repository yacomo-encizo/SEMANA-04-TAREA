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
public class Ejercicio3 {
    
public static void main(String[] args) {
        Scanner arje=new Scanner (System.in);
        System.out.println("Ingrese el radio: ");
        int radio=arje.nextInt();
        double longitud=radio*2*(3.1415);
        System.out.println("Longitud es de = "+longitud+" cm ");
    }
    
}
