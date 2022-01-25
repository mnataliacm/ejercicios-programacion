package tema05.del11_20;
/**
 * Tema 5
 * Ejercicio 18
 * Programa que obtiene los números enteros que hay entre dos números introducidos por teclado y validados como distintos.
 * Empezar por el menor e ir incrementando de 7 en 7
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio18 {
  public static void main(String[] args) {

    System.out.println("___Programa que obtiene enteros entre dos números, incrementando de 7 en 7___");
    System.out.print("Introduce el primer número: ");
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce el segundo número: ");
    int num2 = Integer.parseInt(System.console().readLine());
    
    int mayor = 0;
    int menor = 0;

    while (num1 == num2) {
      System.out.println("Los números introducidos son iguales");
      System.out.print("Introduce el primer número: ");
      num1 = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce el segundo número: ");
      num2 = Integer.parseInt(System.console().readLine());
    }
    
    if (num1 < num2) {
      menor = num1;
      mayor = num2;
    }else {
      menor = num2;
      mayor = num1;
    }

    System.out.println("\n  Números obtenidos  ");
    System.out.println("    entre " + menor + " y " + mayor);
    System.out.println("---------------------");
    System.out.printf("%10d\n", menor);

    for (int n = 7; n < mayor; n += 7) {
      System.out.printf("%10d\n", menor + n);
    }    
  }
}

