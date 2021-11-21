/**
 * Tema 5
 * Ejercicio 42
 * Programa que pide número entero positivo y muestra los 5 consecutivos indicando si es primo o no.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio42 {
  public static void main(String[] args) {

    System.out.println("___Programa que muestra 5 números a partir del indicado y dice si son primos___");
    System.out.print("Introduce un número entero positivo: ");
    int numero = Integer.parseInt(System.console().readLine());
    //variables
    boolean primo;
    System.out.println();
    for (int n = numero; n < numero + 5; n++) {
      primo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0){
        primo = false;
        } 
      }
      if (primo) {
        System.out.println("El número " + n + " es primo");
      } else {
        System.out.println("El número " + n + " no es primo");

      }
    }   
  }
}

