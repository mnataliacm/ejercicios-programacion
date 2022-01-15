package tema07b;

/**
 * Tema 7b
 *
 * Ejercicio 13 Programa que calcula la estatura media, mínima y máxima en cm de
 * personas de diferentes paises Array con los paises: España, Rusia, Japón y
 * Australia. Simular datos de altura en array de 4 x 10 con números aleatorios
 * entre 140 y 210. Decimales despreciar. Mostrar paises mediante array no
 * escritos a mano
 * 
 * A VECES RESULTADO EXTRAÑO ????
 *
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio13 {

  public static void main(String[] args) {

    //variables
    //int num = (int)(Math.random() * 141) + 70;
    String[] pais = {"España", "Rusia", "Japón", "Australia"};
    int[][] n = new int[4][10];
    int maximo1 = Integer.MIN_VALUE;
    int minimo1 = Integer.MAX_VALUE;
    int media1 = 0;
    int maximo2 = Integer.MIN_VALUE;
    int minimo2 = Integer.MAX_VALUE;
    int media2 = 0;
    int maximo3 = Integer.MIN_VALUE;
    int minimo3 = Integer.MAX_VALUE;
    int media3 = 0;
    int maximo4 = Integer.MIN_VALUE;
    int minimo4 = Integer.MAX_VALUE;
    int media4 = 0;
    //programa
    System.out.println("Calcular la altura media, mínima y máxima de los paises");
    //genero array con alturas
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
        n[i][j] = (int) (Math.random() * 71) + 140;
      }
    }
    //calculo mínimo, máximo y  media
    for (int i = 0; i < n.length; i++) {
      for (int j = 0; j < n[0].length; j++) {
        if (i == 0) {
          media1 += n[i][j];
          if (n[i][j] > maximo1) {
            maximo1 = n[i][j];
          }
          if (n[i][j] < minimo1) {
            minimo1 = n[i][j];
          }
        } else if (i == 1) {
          media2 += n[i][j];
          if (n[i][j] > maximo2) {
            maximo2 = n[i][j];
          }
          if (n[i][j] < minimo1) {
            minimo2 = n[i][j];
          }
        } else if (i == 2) {
          media3 += n[i][j];
          if (n[i][j] > maximo3) {
            maximo3 = n[i][j];
          }
          if (n[i][j] < minimo3) {
            minimo3 = n[i][j];
          }
        } else if (i == 3) {
          media4 += n[i][j];
          if (n[i][j] > maximo4) {
            maximo4 = n[i][j];
          }
          if (n[i][j] < minimo1) {
            minimo4 = n[i][j];
          }
        }
      }
    }
    System.out.println("");
    //imprimo array y resultados
    System.out.print("                                                                                   MIN    MAX    MED    ");
    System.out.print("\n          ┌───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┬───────┐ ┌───────┬───────┬───────┐\n");
    for (int i = 0; i < n.length; i++) {
      System.out.printf("%-10s│", pais[i]);
      for (int j = 0; j < n[0].length; j++) {
        System.out.printf(" %4d │", n[i][j]);
      }
      if (i == 0) {
        System.out.printf(" │ %4d │ %4d │ %4d │", minimo1, maximo1, media1 / n[0].length);
      }
      if (i == 1) {
        System.out.printf(" │ %4d │ %4d │ %4d │", minimo2, maximo2, media2 / n[0].length);
      }
      if (i == 2) {
        System.out.printf(" │ %4d │ %4d │ %4d │", minimo3, maximo3, media3 / n[0].length);
      }
      if (i == 3) {
        System.out.printf(" │ %4d │ %4d │ %4d │", minimo4, maximo4, media4 / n[0].length);
      }
      if (i < n.length - 1) {
        System.out.println("\n          ├───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┼───────┤ ├───────┼───────┼───────┤");
      } else {
        System.out.println("\n          └───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┴───────┘ └───────┴───────┴───────┘");
      }
    }
    System.out.println();
  }
}
