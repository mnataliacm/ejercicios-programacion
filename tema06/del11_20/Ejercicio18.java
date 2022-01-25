package tema06.del11_20;
/**
 * Tema 6
 * Ejercicio 18
 * Programa que muestra colores aleatorios, no se repiten.
 * Colores: rojo, azul, verde, amarillo, violeta y naranja.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio18 {
  public static void main(String[] args) {

    System.out.println("___Programa que muestra 3 colores aleatorios___");
    System.out.println();
    String color = "";
    String cuarto1 = "a";
    String cuarto2 = "b";
    String cuarto3 = "c";
    int numero = 0;
    int i = 0;
    do {
      for (i = 0; i < 3; i++) {
        numero = (int) (Math.random() * 6) + 1;
        switch (numero) {
          case 1:
            color = "31m";
            break;
          case 2:
            color = "32m";
            break;
          case 3:
            color = "33m";
            break;
          case 4:
            color = "34m";
            break;
          case 5:
            color = "35m";
            break;
          case 6:
            color = "36m";
            break;
          default:
            break;
        }
        if (i == 0) {
        cuarto1 = color;
        } else if (i == 1) {
          cuarto2 = color;
        } else if (i == 2) {
          cuarto3 = color;
      }
      }
      i--;
      } while ((cuarto1.equals(cuarto2)) || (cuarto2.equals(cuarto3)) || (cuarto3.equals(cuarto1)));

    System.out.println();
    System.out.println("╔════╗ ╔════╗ ╔════╗");
    System.out.printf("║\033[%s████\033[39;49m║ ║\033[%s████\033[39;49m║ ║\033[%s████\033[39;49m║\n", cuarto1, cuarto2, cuarto3);
    System.out.printf("║\033[%s████\033[39;49m║ ║\033[%s████\033[39;49m║ ║\033[%s████\033[39;49m║\n", cuarto1, cuarto2, cuarto3);
    System.out.println("╚════╝ ╚════╝ ╚════╝");
    System.out.println();
    System.out.println(cuarto1);
    System.out.println(cuarto2);
    System.out.println(cuarto3);
  }
}
