/**
 * Tema 6
 * Ejercicio 05
 * Programa que muestra 50 números aleatorios entre 100 y 199 (ambos incluidos) separados por espacios.
 * Mostrar el máximo, el mínimo y la media.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    int mayor = 0;
    int menor = 200;
    int media = 0;
    int i = 0;

    System.out.println("___50 números aleatorios___");
    for (i = 1; i < 50; i++) {
      int numero = (int)(Math.random() * 100) + 100;
      System.out.print(numero + " ");
      if (numero > mayor) {
        mayor = numero;      
      } else if (numero < menor) {
          menor = numero; 
      }
      media += numero;
    }
    media /= i;
    System.out.println();
    System.out.println("El número mayor ha sido: " + mayor);
    System.out.println("El número menor ha sido: " + menor);
    System.out.println("La media de todos los números es: " + media);
  }
}

