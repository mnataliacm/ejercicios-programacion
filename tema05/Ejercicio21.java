/**
 * Tema 5
 * Ejercicio 21
 * Programa que pide números hasta que se introduce uno negativo
 * Contar números, la media de impares y el mayor de los pares
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio21 {
  public static void main(String[] args) {

    int numero = 0;
    int contar = 0;
    int par = 0;
    double impar = 0;

    System.out.println("___Programa que cuenta números___");
    do {
      System.out.print("Introduce un número: ");
      numero = Integer.parseInt(System.console().readLine());
      if (numero < 0) {
        break;
      } else {
        contar++;
        if ((numero%2 == 0) && (numero > par)) {
          par = numero;
        }else {
          impar = impar + numero;
        }
      } 
    } while (numero >= 0);
    System.out.println("\nEl conteo ha terminado, has introducido " + (contar) + " numeros");
    System.out.println("El mayor número par que has introducido es: " + par);
    System.out.println("La media de números impares es: " + (impar / 2));
  }
}

