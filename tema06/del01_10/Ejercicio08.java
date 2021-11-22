/**
 * Tema 6
 * Ejercicio 8
 * Programa que muestre 3 apuestas de la quiniela en 3 columnas para los 14 partidos y el pleno (15 filas)
 * 
 * Mejorar lo anterior cambiando probabilidades
 * 1 = 1/2 o 3/6 ; X = 1/3 o 2/6 ; 2 = 1/6
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio08 {
  public static void main(String[] args) {

    System.out.println("___Programa que rellena la Quiniela___");
    String num = "";
    int conteo = 0;
    int numero = 0;
    for (conteo = 1; conteo <= 15; conteo++) {
            System.out.printf("\nPartido %2d:", conteo); 
      for (int i = 0; i < 3; i++) {
        numero = (int)(Math.random() * 6 + 1);
        switch (numero) {
          case 1:
          case 2:
          case 3:
            num = "1";
            break;
          case 4:
          case 5:
            num = "X";
            break;
          case 6:
            num = "2";
            break;
          default:
            break;
        }
        System.out.printf("%3s", num);
      }
    }
    System.out.println();
  }
}

