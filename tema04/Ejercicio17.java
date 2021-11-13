/**
 * Tema 4
 * Ejercicio 17 
 * Programa que diga cual es la última cifra de un número entero introducido por teclado.
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio17 {
  public static void main(String[] args) {
    
    System.out.println("___Programa que averigua la ultima cifra de un número entero___");
    System.out.println("Introduce un número entero: ");
    int numero = (Integer.parseInt(System.console().readLine()));
    
    int ultimoNumero = numero%10;
    
    System.out.println("El último dígito de: " + numero + " es " + ultimoNumero);
    
  }
}
