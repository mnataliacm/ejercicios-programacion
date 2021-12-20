/**
 * Tema 7
 * Ejercicio 12
 * 
 * Programa que pide 10 números por teclado. Los muestra en una tabla junto al
 * indice (0-9).
 * Pedir dos posiciones (inicial y final) comprobar que inicial es menor que
 * final y que esten entre 0-9
 * Colocar el número de la posición inicial en la posición final y que el resto
 * roten para no perder ninguno.
 * Mostrar otra tabla con el array resultante
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio12 {
  public static void main(String[] args) {

    //variables
    //int[] n = {22, 15, 50, 4, 10, 9, 27, 14, 88, 36};
    int[] n = new int [10];
    int[] r = new int [10];
    int inicio = 0;
    int fin = 0;
    //programa
    System.out.println("Introduce 10 números: ");
    for (int i = 0; i < 10; i++) {
      n[i] = Integer.parseInt(System.console().readLine());
    }
    //Array inicial
    System.out.println("\n");
    System.out.print("Índice  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%5d ", i);
    }
    System.out.println("\n        ┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("Valor   │");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%4d │", n[i]);
    }
    System.out.println("\n        └─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println("                                   Array inicial ");
    System.out.println();
    do {
      System.out.print("Introduce posición del número a mover: ");
      inicio = Integer.parseInt(System.console().readLine());
      System.out.print("Introduce la posición donde hay que ponerlo: ");
      fin = Integer.parseInt(System.console().readLine());
      if ((inicio < 0) || (inicio > 9) || (fin < 0) || (fin > 9)) {
        System.out.println("El número inicial y final deben estar entre 0 y 9");
      } else if ((inicio > fin)) {
        System.out.println("El número inicial debe ser menor que número final");
      } 
    } while ((inicio > fin) || (inicio < 0) || (inicio > 9) && (fin < 0) || (fin > 9));
    //copio números
    for (int i = 0; i < 10; i++) {
      r[i] = n[i];
    }
    //muevo números desde fin
    r[fin] = n[inicio];
    for (int i = fin + 1; i < 10; i++) {
      r[i] = n[i - 1];
    }
    //muevo primeros números
    r[0] = n[9];
    for (int i = 0; i < inicio; i++) {
      r[i + 1] = n[i];
    }

    //Array final
    System.out.println();
    System.out.print("Índice  ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("%5d ", i);
    }
    System.out.println("\n        ┌─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("Valor   │");
    for (int i = 0; i < 10; i++) {
      System.out.printf(" %3d │", r[i]);
    }
    System.out.println("\n        └─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");
    System.out.println("                                    Array final ");
    System.out.println();
  }
}
