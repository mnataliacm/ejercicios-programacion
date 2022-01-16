
import tema08.Ejercicio01_14;

/**
 * Tema 8
 * 
 * Ejercicio 16
 * Programa que muestra los capicuos que hay entre 1 y 99999
 *
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio16 {
  public static void main(String[] args) {

    //programa
    System.out.println("  MOSTRAR NÚMEROS CAPICÚA ENTRE 1 Y 99999  ");
    System.out.println("*******************************************");
    System.out.println("Los capicuos son: ");
    for (int i = 1; i < 99999; i++) {
     if (Ejercicio01_14.esCapicua(i)) {
       System.out.print(i + " ");
     }
    }
    System.out.println();
  }
}