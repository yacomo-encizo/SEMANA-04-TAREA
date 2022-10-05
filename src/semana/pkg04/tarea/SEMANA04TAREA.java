/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana.pkg04.tarea;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class SEMANA04TAREA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //coeficientes ax math  ax2+ bx + c = 0
        Scanner arje=new Scanner (System.in);
       double d,a,b,c,x1,x2;
       System.out.println("Ingrese el primer coeficiente A: ");
        a=arje.nextInt();
        System.out.println("Ingrese el segundo coeficiente B: ");
        b=arje.nextInt();
        System.out.println("Ingrese el tercer coeficiente C: ");
        c=arje.nextInt();
      //calculando la determinate
      //d donde se va guardar
      //    1. Si D > 0, entonces la ecuación tiene dos soluciones
      // reales distintas.
      //    2) Si D = 0, entonces la ecuación tiene exactamente
      //una solución real (doble).
      //    3) Si D < 0, entonces la ecuación no tiene solución 
      //real (pero si solución compleja)
       d=((b*b)-4*a*c);
       System.out.println("Resultado de la operacion: "+d);
        if(d<0){
           System.out.println("no tiene solución real");
       }else{
           x1=(-b+Math.sqrt(d)/(2*a));
           x2=(-b-Math.sqrt(d)/(2*a));
           System.out.println("Resultado: "+x1);
           System.out.println("Resultado: "+x2);
       }
           
           
    }
}
