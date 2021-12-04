/**
 * Tema 6
 * Ejercicio 1
 * Programa que muestra una tirada de 3 dados.
 * Mostrar también la suma de los puntos conseguidos.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio01 {
  public static void main(String[] args) {

    System.out.println("___Tirar los dados___");
    System.out.println("Se han tirado tres dados: ");

    int suma = 0;
    for (int i = 1; i <= 3; i++) {
      int tirada = (int)(Math.random() * 7) + 1;
      System.out.printf("\nDado %d: %d", i, tirada);
      suma += tirada;
    }
    System.out.println();
    System.out.println("Total de puntos: " + suma);
  }
}

