/**
 * Tema 6
 * Ejercicio 23
 * 
 * Programa que pinta las figuras de un dado de poker: As, K, Q, J, 7 y 8
 * Genera la tirada de 5 dados
 * 🂷 🂸 🂻 🂽 🂾 🂱
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio23 {
  public static void main(String[] args) {

    System.out.println("___Figuras de un dado de poker___");
    //variables
    int conteo = 0;
    String rojo = "\033[31m"; 
    String reset = "\033[0m";
    System.out.println();
    do {
      int dado = (int)(Math.random() * 6) + 1;
      switch (dado) {
        case 1:
          System.out.printf("%s 🂷 %s", rojo, reset);
          break;
        case 2:
          System.out.printf("%s 🂸 %s", rojo, reset);
          break;
        case 3:
          System.out.printf("%s 🂻 %s", rojo, reset);
          break;
        case 4:
          System.out.printf("%s 🂽 %s", rojo, reset);
          break;
        case 5:
          System.out.printf("%s 🂾 %s", rojo, reset);
          break;
        case 6:
          System.out.printf("%s 🂱 %s", rojo, reset);
          break;
        default:
          break;
      }
      conteo++;
    } while (conteo < 6);
    System.out.println();
  }
}
