/**
 * 
 * Tema 5
 * Ejercicio 39
 * Programa que pida un entero positivo y muestre el factorial
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio39 {
  public static void main(String[] args) {

    System.out.println("___Programa que muestra el factorial___");
    System.out.print("Introduce un número entero positivo: ");
    int numero = Integer.parseInt(System.console().readLine());

    System.out.println("\nCalculado el factorial de " + numero);
    int total = 1;
    for (int i = 1; i <= numero; i++) {
      total = total * i;
      System.out.printf("%d! = %d\n", i, total);
    }
    
  
    

    System.out.print("");
    System.out.print("");

  }
}

