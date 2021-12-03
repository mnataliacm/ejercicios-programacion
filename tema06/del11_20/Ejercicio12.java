/**
 * Tema 6
 * Ejercicio 12
 * Programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
 * Código ascii entre 32 y 126. 
 * Casting con char para convertir de entero a carácter.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio12 {
  public static void main(String[] args) {

    System.out.println("___Programa que muestra caracteres aleatorios___");
    int x = 0;
    while (x != 5000) {
      int caracter = (int)(Math.random() * 127 + 1);
      if ((caracter >= 32) && (caracter <= 126)) {
        System.out.print((char)caracter);
        x++;
      }
    }
    System.out.println();
  }
}
