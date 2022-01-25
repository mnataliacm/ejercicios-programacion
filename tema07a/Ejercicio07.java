package tema07a;
/**
 * Tema 7
 * Ejercicio 7
 * 
 * Programa que genera 100 números aleatorios del 0 al 20 y los muestre separados con espacios.
 * Pedir dos valores y cambiar las ocurrencias del primer valor por el segundo.
 * Los cambios aparecen entrecomillados.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio07 {
  public static void main(String[] args) {

    //variables
    int[] numeros = new int[100];
    int num = (int)(Math.random() * 20);
    int num1 = 0;
    int num2 = 0;

    System.out.println("Generar 100 números aleatorios:");
    for (int i = 0; i < 100; i++) {
      num = (int)(Math.random() * 20);
      numeros[i] = num;
    }
    for (int i = 0; i < 100; i++) {
      System.out.print(numeros[i] + " ");
    }
    System.out.println();
    System.out.println("El número que quieres cambiar es: ");
    num1 = Integer.parseInt(System.console().readLine());
    System.out.println("Se cambiará por el número: ");
    num2 = Integer.parseInt(System.console().readLine());
    System.out.println();
    System.out.println("El resultado es: ");
    for (int i = 0; i < 100; i++) {
      if (numeros[i] == num1) {
        numeros[i] = num2;
        System.out.print("\"" + numeros[i]+ "\" ");
      } else {
        System.out.print(numeros[i] + " ");
      } 
    }
    System.out.println();    
  }
}

