/**
 * Tema 5
 * Ejercicio 13
 * Programa que lee una lista de diez números y determina cuantos son positivos y cuantos negativos.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio13 {
  public static void main(String[] args) {

    System.out.println("___Programa que dados 10 números cuenta positivos y negativos___");
    int positivo = 0;
    int negativo = 0;
    int conteo = 0;
    do {
      System.out.print("Introduce un número (positivo o negativo): ");
      int numero = Integer.parseInt(System.console().readLine());
      conteo++;
      if (numero < 0) {
        negativo++;
      } else {
        positivo++;
      }
    } while (conteo != 10);
    
    System.out.println("Los números positivos son: " + positivo);
    System.out.println("Los números negativos son: " + negativo);



  }
}

