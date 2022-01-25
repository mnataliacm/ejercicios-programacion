package tema07a;
/**
 *
 * Tema 7
 * Ejercicio 17
 * 
 * Programa que rellena un array de 10 números enteros aleatorios entre 0 y 100
 * Pedir al usuario un número y comprobar si está en el array.
 * Si no está mensaje de error y pedir de nuevo un número así hasta que acierte.
 * El programa rotará el array hacia la derecha las veces que haga falta hasta que el número introducido quede en la posición 0 del array, mostrar por pantalla.
 * 
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio17 {
  public static void main(String[] args) {

    //VARIABLES
    int[] numeros = new int[10];
    int buscar = 0;
    int conteo = 0;
    int i = 0;
    boolean encontrado = false;
    //PROGRAMA
    System.out.println();
    for (i = 0; i < 10; i++) {
      numeros[i] = (int)(Math.random() * 101);
    }
    /////
    for (int n : numeros) {
      System.out.print(n + " ");
    }
    do {
      System.out.println();
      System.out.print("Dime un número: ");
      buscar = Integer.parseInt(System.console().readLine());
      for (i = 0; i < 10; i++) {
        if (numeros[i] == buscar) {
          encontrado = true;
          conteo = i;
        }
      }
      if (!encontrado) {
        System.out.print("El número " + buscar + " no está, intentalo con otro número.");
      }
    } while (!encontrado);
    System.out.println("Número encontrado, organizando números ...");
    //ORDENANDO ARRAY
    int[] ordenado = new int [10];
    for (int j = 0; j < 10 - conteo; j++) {
      ordenado[j] = numeros [(j + conteo)];
    }
    int a = 0;
    for (int j = 10 - conteo; j < 10; j++) {
      ordenado[j] = numeros[a];
      a++;
    }
    System.out.println("El array original es: ");
    for (int n : numeros) {
      System.out.print(n + " ");
    }
    System.out.println("El array tras ordenar es: ");
    for (int n : ordenado) {
      System.out.print(n + " ");
    }
    System.out.println("");   
  }
}
 