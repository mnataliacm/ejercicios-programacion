package tema06.del01_10;
/**
 * Tema 6
 * Ejercicio 7
 * Programa que muestre 3 apuestas de la quiniela en 3 columnas para los 14 partidos y el pleno (15 filas)
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio07 {
  public static void main(String[] args) {

    String num = "";
    int conteo = 0;
    int numero = 0;
    System.out.print(" ┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅");
    for (conteo = 1; conteo <= 15; conteo++) {
      System.out.printf("\n┋Partido %2d:", conteo); 
      for (int i = 1; i < 4; i++) {
        numero = (int)(Math.random() * 3 + 1);
        switch (numero) {
          case 1:
            num = "1";
            break;
          case 2:
            num = "X";
            break;
          case 3:
            num = "2";
            break;
          default:
            break;
        }
        if (num.equals("1")) {
        System.out.printf("┋%1s %1s %1s┋", num, " ", " ");
        } else if (num.equals("X")) {
          System.out.printf("┋%1s %1s %1s┋", " ", num, " ");
        } else if (num.equals("2")) {
          System.out.printf("┋%1s %1s %1s┋", " ", " ", num);
        }
      }
    }
    System.out.println();
    System.out.println(" ┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅┅");
  }
}

