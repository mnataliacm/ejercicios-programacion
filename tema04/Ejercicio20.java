package tema04;
/**
 * Tema 4
 * Ejercicio 20 
 * Programa que diga si un número de 5 cifras entero positivo es capicúa.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio20 {
  public static void main(String[] args) {
    
    System.out.println("___Programa para comprobar si un número es capicua___");
    System.out.print("Introduce un número entero positivo (máximo 5 cifras): ");
    int numero = Integer.parseInt(System.console().readLine());

    int conteo = 0;
    int numeroDado = numero/10;

    if (numeroDado == 0) {
      conteo = 1;
    } else if ((numeroDado/10) == 0) {
      conteo = 2;
    }  else if ((numeroDado/100) == 0) {
      conteo = 3;
    }  else if ((numeroDado/1000) == 0) {
      conteo = 4;
    }  else if ((numeroDado/10000) == 0) {
      conteo = 5;
    } else {
      System.out.println("El número " + numero + " tiene más de 5 dígitos");
      System.exit(0);
    }

    switch (conteo) {
      case 1:
        System.out.println("");
        System.out.println("El número introducido: " + numero + " es capipúa");
        break;
      case 2:
        System.out.println("");
        if ((numero/10) == (numero%10)) {
          System.out.println("El número " + numero + " es capicúa");
        } else {
          System.out.println("El número " + numero + " no es capicúa");
        }
        break;
      case 3:
        System.out.println("");
        if ((numero/100) == (numero%10)) {
          System.out.println("El número " + numero + " es capicúa");
        } else {
          System.out.println("El número " + numero + " no es capicúa");
        }
        break;
      case 4:
        System.out.println("");
        if ((numero/1000) == (numero%10)) {
          System.out.println("El número " + numero + " es capicúa");
        } else {
          System.out.println("El número " + numero + " no es capicúa");
        }
        break;
      case 5:
        System.out.println("");
        if ((numero/10000) == (numero%10)) {
          System.out.println("El número " + numero + " es capicúa");
        } else {
          System.out.println("El número " + numero + " no es capicúa");
        }
        break;
      default:
        System.out.println("El número " + numero + " no es capicúa");
    }
  }
}
