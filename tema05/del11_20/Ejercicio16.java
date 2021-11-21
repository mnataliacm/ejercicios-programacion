/**
 * Tema 5
 * Ejercicio 16
 * Programa que comprueba si un numero es primo
 * Primo = solo divisible entre si mismo y entre 1
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio16 {
  public static void main(String[] args) {

    System.out.println("___Programa que comprueba números primos___");
    System.out.print("Introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());
    int n = 0;
    Boolean primo = true;

    while (numero <= 1) {
      System.out.println("El número tiene que ser mayor de 1");
      System.out.print("Introduce un número: ");
      numero = Integer.parseInt(System.console().readLine());
    }
    
    for (n = 2; n < numero; n++) {
      if (numero % n == 0){
       primo = false;
      } 
    }
    if (primo.equals(false)) {
      System.out.println("El número " + numero + " no es primo");
    } else {
      System.out.println("El número " + numero + " es primo");
      }

  }
}

