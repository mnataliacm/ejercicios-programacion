/**
 * Tema 4
 * Ejercicio 19 
 * Programa que nos diga cuántos dígitos tiene un numero entero de 5 cifras dado (positivo o negativo).
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio19 {
  public static void main(String[] args) {
    
    System.out.println(" Programa que cuenta los dígitos de un número");
    System.out.println(" Introduce un número de 5 cifras, positivo o negativo: ");
    int numeroDado = (Integer.parseInt(System.console().readLine()));
    int numero = numeroDado/10;
    int conteo = 0;

    if (numero == 0) {
      conteo = 1;
      System.out.println("El número " + numeroDado + " tiene " + conteo + " dígitos");
    } else if ((numero/10) == 0) {
      conteo = 2;
      System.out.println("El número " + numeroDado + " tiene " + conteo + " dígitos");
    }  else if ((numero/100) == 0) {
      conteo = 3;
      System.out.println("El número " + numeroDado + " tiene " + conteo + " dígitos");
    }  else if ((numero/1000) == 0) {
      conteo = 4;
      System.out.println("El número " + numeroDado + " tiene " + conteo + " dígitos");
    }  else if ((numero/10000) == 0) {
      conteo = 5;
      System.out.println("El número " + numeroDado + " tiene " + conteo + " dígitos");
    } else {
      System.out.println("El número " + numeroDado + " tiene más de 5 dígitos");
    }
  }
}
