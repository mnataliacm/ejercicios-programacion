/**
 * Tema 5
 * Ejercicio 32
 * Programa que dado un número entero positivo diga cuáles son y cuánto suman los dígitos pares.
 * Los pares se suman y se muestran en orden de izq a dere. Usar long  si hace falta.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio32 {
  public static void main(String[] args) {

    System.out.println("___Programa que muestra y suma los pares___");
    System.out.print("Introduce un número entero positivo: ");
    long numero = Long.parseLong(System.console().readLine());
    //variables
    long num = numero;
    long cortar = 1;
    long suma = 0;
    //Contar dígitos
    while (num != 0) {
      num = num / 10;
      cortar *= 10;
    }
    System.out.println();
    System.out.print("Dígitos pares: ");
    //comprobar primer dígito
    cortar = cortar / 10;
    num = numero / cortar;
    if (num % 2 == 0) {
      System.out.print(num + ", ");
      suma = num;
    }
    //comprobar resto dígitos
    while (cortar >= 10) {
      cortar = cortar / 10;
      num = (numero / cortar) % 10;
      if (num % 2 == 0) {
        System.out.print(num + ", ");
        suma = suma + num;
      }
    }
    System.out.println();
    System.out.println("Suma de los dígitos pares: " + suma);

    /*//comprobar digitos
    cortar = cortar / 10;
    num = numero / cortar;
    if (num % 2 == 0) {
      System.out.print(num + ", ");
      suma = num;
    }
    while (cortar >= 10) {
      cortar = cortar / 10;
      num = (numero / cortar) % 10;
      if (num % 2 == 0) {
        System.out.print(num + ", ");
        suma = suma + num;
      }
    }
    System.out.println();
    System.out.println("Suma de los dígitos pares: " + suma);*/
  }
}
