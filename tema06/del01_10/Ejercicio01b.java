/**
 * Tema 6
 * Ejercicio 1
 * Programa que muestra una tirada de 3 dados.
 * Mostrar también la suma de los puntos conseguidos.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio01b {
  public static void main(String[] args) {

    // VARIABLES
    String dado1 = "";
    String dado2 = "";
    String dado3 = "";
    String dado4 = "";
    String dado5 = "";
    int [] tiradas = new int[3];
    System.out.println("___Tirar los dados___");
    System.out.println("Se han tirado tres dados: ");

    int suma = 0;
    for (int i = 0; i < 3; i++) {
      int tirada = (int) (Math.random() * 7) + 1;
      switch (tirada) {
        case 1:
          dado1 = "┏━━━━━━━┓";
          dado2 = "┃       ┃";
          dado3 = "┃   ●   ┃";
          dado4 = "┃       ┃";
          dado5 = "┗━━━━━━━┛";
          break;
        case 2:
          dado1 = "┏━━━━━━━┓";
          dado2 = "┃     ● ┃";
          dado3 = "┃       ┃";
          dado4 = "┃ ●     ┃";
          dado5 = "┗━━━━━━━┛";
          break;
        case 3:
          dado1 = "┏━━━━━━━┓";
          dado2 = "┃     ● ┃";
          dado3 = "┃   ●   ┃";
          dado4 = "┃ ●     ┃";
          dado5 = "┗━━━━━━━┛";
          break;
        case 4:
          dado1 = "┏━━━━━━━┓";
          dado2 = "┃ ●   ● ┃";
          dado3 = "┃       ┃";
          dado4 = "┃ ●   ● ┃";
          dado5 = "┗━━━━━━━┛";
          break;
        case 5:
          dado1 = "┏━━━━━━━┓";
          dado2 = "┃ ●   ● ┃";
          dado3 = "┃   ●   ┃";
          dado4 = "┃ ●   ● ┃";
          dado5 = "┗━━━━━━━┛";
          break;
        case 6:
          dado1 = "┏━━━━━━━┓";
          dado2 = "┃ ●   ● ┃";
          dado3 = "┃ ●   ● ┃";
          dado4 = "┃ ●   ● ┃";
          dado5 = "┗━━━━━━━┛";
          break;
        default:
          break;
      }
      System.out.printf("\n%s\n%s\n%s\n%s\n%s", dado1, dado2, dado3, dado4, dado5);
      suma += tirada;
      tiradas[i] = tirada;
    }
    System.out.println();
    System.out.println("Total de puntos: " + suma);
    System.out.println();
    for (int j = 0; j < tiradas.length; j++) {
      System.out.println(tiradas[j]);
    }
    

  }
}
