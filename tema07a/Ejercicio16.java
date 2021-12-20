import java.util.Scanner;
/**
 *
 * Tema 7
 * Ejercicio 16
 * 
 * Programa que rellena un array de 20 elementos con números enteros aleatorios entre 0 y 400 (ambos incluidos)
 * Preguntar al usuario si quiere buscar los multiplos de 5 o de 7.
 * Mostrar el array con los elegidos entre corchetes.
 * 
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio16 {
  public static void main(String[] args) {

    //variables
    Scanner s = new Scanner (System.in);
    int[] n = new int[20];
    //programa
    System.out.println("__PROGRAMA QUE BUSCA MULTIPLOS DE 5 O DE 7__");
    System.out.println();
    for (int i = 0; i < n.length; i++) {
      n[i] = (int)(Math.random() * 501);
    }
    for (int i = 0; i < n.length; i++) {
      System.out.print(n[i] + " ");
    }
    System.out.println();
    System.out.print("¿Que números quiere resaltar? (1 = múltiplos de 5, 2 = múltiplos de 7) : ");
    int buscar = s.nextInt();
    for (int i = 0; i < n.length; i++) {
      if ((buscar == 1) && (n[i] % 5 == 0)) {
        System.out.print("[" + n[i] + "]" + " ");
      } else if ((buscar == 2) && (n[i] % 7 == 0)) {
        System.out.print("[" + n[i] + "]" + " ");
      } else {
        System.out.print(n[i] + " ");
      }
    }
    System.out.println("");   
  }
}
