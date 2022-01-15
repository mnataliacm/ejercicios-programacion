package tema08;

import java.util.Scanner;

/**
 * Tema 8
 * 
 * Probar las funciones
 *
 * @author Natalia Castillo Muñoz
 */
public class probando {
  public static void main(String[] args) {

    //variables
    Scanner s = new Scanner(System.in);
    int num = (int)(Math.random() * 4) + 1;
    int n = 0;
    //ES CAPICÚA
    System.out.println("COMPROBAR CAPICÚA");
    System.out.print("Introduce un número entero positivo: ");
    n = s.nextInt();
    if (Ejercicio01.esCapicua(n)) {
      System.out.println("El número " + n + " es capicúo.");
    } else {
      System.out.println("El número " + n + " no es capicúo.");
    }
    //SI ES PRIMO
    System.out.println("COMPROBAR PRIMO");
    System.out.print("Introduce un número entero positivo: ");
    n = s.nextInt();
    if (Ejercicio01.esPrimo(n)) {
      System.out.println("El número " + n + " es primo.");
    } else {
      System.out.println("El número " + n + " no es primo.");
    }
    //SIGUIENTE PRIMO
    System.out.println("BUSCAR SIGUIENTE PRIMO");
    System.out.print("Introduce un número entero positivo: ");
    n = s.nextInt();
    if (Ejercicio01.esPrimo(n)) {
      System.out.println("El número " + n + " es primo.");
    } else {
      System.out.println("El número " + n + " no es primo.");
    }


//    //comprobar datos introducidos
//    do {
//      System.out.print("Introduce el número inicial: ");
//      inicio = s.nextInt();
//      System.out.print("Introduce el número final: ");
//      fin = s.nextInt();
//      if ((inicio < 0) || (inicio > 9) || (fin < 0) || (fin > 9)) {
//        System.out.println("El número inicial y final deben estar entre 0 y 9");
//      } else if ((inicio > fin)) {
//        System.out.println("El número inicial debe ser menor que número final");
//      } 
//    } while ((inicio > fin) || (inicio < 0) || (inicio > 9) && (fin < 0) || (fin > 9));   
//    ////////////////   
    System.out.println();
    long num = 15951;
    long numero = num;
    long ultimo = 0;
    long numeroReves = 0;

    while( numero > 0 ) {
      ultimo = numero % 10;
      numeroReves = numeroReves * 10 + ultimo;
      numero /= 10;
   }
    if (num == numeroReves) {
      System.out.println("El número " + num + " es capicúa");
    } else {
      System.out.println("El número " + num + " no es capicúa");
    }
  }
}