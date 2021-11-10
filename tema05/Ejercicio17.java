/**
 * Tema 5
 * Ejercicio 17
 * Programa que suma los 100 números siguientes a un numero entero positivo dado por teclado. Comprobar que el numero sea positivo.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio17 {
  public static void main(String[] args) {

    System.out.println("___Programa que suma 100 números a partir del numero dado___");
    System.out.print("Introduce un número entero positivo: ");
    int num = Integer.parseInt(System.console().readLine());
    int num1 = 0;
    int num2 = 0;
    int suma = 0;


    while (num < 0) {
      System.out.println("El número tiene que ser entero y positivo");
      System.out.print("Introduce un número: ");
      num = Integer.parseInt(System.console().readLine());
    }
    for (int i = 0; i <= 100; i++) {
      num1 = num + i;
      num2 = suma;
      suma = num1 + num2;
    }
    System.out.println("\nEl total de sumar los números desde " + num + " hasta " + (num+100) + " es = " + suma);
    System.out.print("");

  }
}

