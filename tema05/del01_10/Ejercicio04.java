package tema05.del01_10;
/**
 * Tema 5
 * Ejercicio 4
 * Programa que muestra los números del 320 al 160, contando de 20 en 20 hacia atrás usando for
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio04 {
  public static void main(String[] args) {

    System.out.println("___Números del 320 al 160 saltando 20 hacia atrás___");
    for (int i = 320; i >= 160 ; i -= 20){
      System.out.printf("%10d\n", i);
    }
  }
}

