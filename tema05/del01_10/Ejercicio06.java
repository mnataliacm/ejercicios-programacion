package tema05.del01_10;
/**
 * Tema 5
 * Ejercicio 6
 * Programa que muestra los números del 320 al 160, contando de 20 en 20 hacia atrás usando do-while
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio06 {
  public static void main(String[] args) {

    System.out.println("___Cuenta atrás desde 320___");
    
    int i = 320;

    do {
      i = i - 20;
      System.out.printf("%10d\n", i);
    } while (i != 160);
  }
}