package tema07b;

/**
 * Tema 7b
 * Ejercicio 1
 * 
 * Define un array de números enteros de 3 filas por 6 columnas, llamado 'num' y asigna los valores de la tabla. Muestra el resultado en una tabla.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    
    //variables
    int[][] num = new int [3][6];
    num[0][0] = 0;
    num[0][1] = 30;
    num[0][2] = 2;
    num[0][5] = 5;
    num[1][0] = 75;
    num[1][4] = 0;
    num[2][2] = -2;
    num[2][3] = 9;
    num[2][5] = 11;

    System.out.println();
    //MUESTRO ARRAY ORIGINAL
    System.out.println("\n");
    System.out.print("        ");
    for (int i = 0; i < 6; i++) { 
      System.out.printf(" Columna" + i + " ");
    }
    System.out.println();
    System.out.print("         ╭──────────┬───────────┬───────────┬──────────┬──────────┬───────────╮\n");
    System.out.printf(" Fila 0  │");
    for (int i = 0; i < 6; i++) { 
        System.out.printf("%8d │", num[0][i]);
    }
    System.out.println();
    System.out.print("         ├──────────┼───────────┼───────────┼──────────┼──────────┼───────────┤\n");
    System.out.printf(" Fila 1  │");
    for (int i = 0; i < 6; i++) {
      System.out.printf("%8s │", num[1][i]);
    }
    System.out.println();
    System.out.print("         ├──────────┼───────────┼───────────┼──────────┼──────────┼───────────┤\n");
    System.out.printf(" Fila 2  │");
    for (int i = 0; i < 6; i++) {
      System.out.printf("%8s │", num[2][i]);
    }
    System.out.println();
    System.out.println("         ╰──────────┴───────────┴───────────┴──────────┴──────────┴───────────╯");
    System.out.println();
  }
}
