package tema04;
/**
 * Tema 4
 * Ejercicio 18 
 * Programa que indica cual es la primera cifra de un número entero de 5 cifras dado.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio18 {
  public static void main(String[] args) {
    
    System.out.println("Programa para averiguar la primera cifra de un número de 5 dígitos");
    System.out.print("Introduce un número de 5 cifras: ");
    int numero = (Integer.parseInt(System.console().readLine()));

    int primerNumero = (numero/10000);
    
    if ((numero/10000) == 0) {
      System.out.println("El número introducido tiene menos de 5 dígitos");
    } else if (primerNumero > 9){
      System.out.println("El número introducido tiene más de 5 dígitos");
    } else {
        System.out.println("El primer número de " + numero + " es " + primerNumero);
    }
  }
}
