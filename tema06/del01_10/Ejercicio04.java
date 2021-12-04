/**
 * Tema 6
 * Ejercicio 4
 * Programa que muestra 20 números aleatorios entre 0 y 10 (ambos incluidos) separados por espacios
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio04 {
  public static void main(String[] args) {

    System.out.println("___Programa que muestra 20 números aleatorios entre 0 y 10___");
    for (int i = 1; i <= 20; i++) {
      int numero = (int)(Math.random() * 10);
      System.out.print(numero + " ");
    }   
    System.out.println();
  }
}

