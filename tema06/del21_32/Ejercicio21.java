/**
 * Tema 6
 * Ejercicio 21
 * Programa que genera una secuencia de cinco monedas de curso legal lanzadas al
 * aire.
 * Monedas: 1, 2, 5, 10, 20 y 50 céntimos, 1 y 2 euros. Posiciones cara y cruz.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio21 {
  public static void main(String[] args) {

    System.out.println("___Programa que lanza 5 monedas al aire___");
    // variables
    String coin = "🪙";
    int moneda = (int) (Math.random() * 8) + 1;
    int lado = (int) (Math.random() * 2) + 1;
    String cara = "";
    int conteo = 0;
    System.out.println();
    // lanzamiento monedas
    do {
      moneda = (int) (Math.random() * 8) + 1;
      lado = (int) (Math.random() * 2) + 1;
      if (lado == 1) {
        cara = "cara";
      } else {
        cara = "cruz";
      }
      switch (moneda) {
        case 1:
          System.out.printf(" 1 céntimo  %3s %5s\n", coin, cara);
          break;
        case 2:
          System.out.printf(" 2 céntimos %3s %5s\n", coin, cara);
          break;
        case 3:
          System.out.printf(" 5 céntimos %3s %5s\n", coin, cara);
          break;
        case 4:
          System.out.printf("10 céntimos %3s %5s\n", coin, cara);
          break;
        case 5:
          System.out.printf("20 céntimos %3s %5s\n", coin, cara);
          break;
        case 6:
          System.out.printf("50 céntimos %3s %5s\n", coin, cara);
          break;
        case 7:
          System.out.printf(" 1 euro     %3s %5s\n", coin, cara);
          break;
        case 8:
          System.out.printf(" 2 euro     %3s %5s\n", coin, cara);
          break;
        default:
          break;
      }
      conteo++;
    } while (conteo < 5);
  }
}
