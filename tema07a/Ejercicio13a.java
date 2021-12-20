/**
 * Tema 7
 * Ejercicio 13
 * 
 * Programa que rellena un array con 100 números enteros 0 y 500 (ambos incl.)
 * Mostrar el array y preguntar si quiere encontrar el máximo o el mínimo
 * Destacar la elección entre **X**
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio13 {
  public static void main(String[] args) {

    //variables
    int num = (int)(Math.random() * 500);
    int[] n = new int[10];
    //programa
    System.out.println("Programa que busca máximo y mínimo");
    System.out.println("");
    for (int i = 0; i < n.length; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
    }
    
    for (int i = 0; i < n.length; i++) {
      System.out.println(n[i]);
    }
    
    
    System.out.println();
  }
}

