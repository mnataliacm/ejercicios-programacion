/**
 * Tema 5
 * Ejercicio 23
 * Programa que recibe números mientras su suma no supere 10.000
 * Mostrar total acumulado, contador de números y la media
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio23 {
  public static void main(String[] args) {

    int suma = 0;
    int numero = 0;
    int conteo = 0;
    
    System.out.println("___Programa que suma números hasta llegar a 10.000___");

     do {
      System.out.print("Introduce un número: ");
      numero = Integer.parseInt(System.console().readLine());
      conteo++;
      suma = suma + numero;

    } while (suma <= 10000);
    
    System.out.printf("Se han introducido %d números\n", conteo);
    System.out.println("\nLa suma de los números introducidos es: " + suma);
    System.out.println("La media de los números introducidos es: " + suma / 2);
  }
}

