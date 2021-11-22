/**
 * Tema 6
 * Ejercicio 7
 * Programa que muestre 3 apuestas de la quiniela en 3 columnas para los 14 partidos y el pleno (15 filas)
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio07 {
  public static void main(String[] args) {

    System.out.println("___Programa que rellena la Quiniela___");
    String num = "";
    int conteo = 0;
    int numero = 0;
    for (conteo = 1; conteo <= 15; conteo++) {
            System.out.printf("\nPartido %2d:", conteo); 
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
        System.out.printf("%3s", num);
      }
    }
    System.out.println();
  }
}

