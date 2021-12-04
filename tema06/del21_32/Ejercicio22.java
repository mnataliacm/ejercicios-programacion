/**
 * Tema 6
 * Ejercicio 22
 * 
 * Programa que pinta una serpiente con un "serpenteo" aleatorio.
 * Cabeza es @ va en la posición 13 (12 espacios delante)
 * Valor aleatorio entre 3 que hará que el siguiente carácter vaya en una
 * posición a la izquierda del anterior, alineado con el anterior o una posición
 * a la derecha del anterior.
 * Pedir longitud serpiente por teclado (incluida cabeza). No comprobamos.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio22 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta una serpiente___");
    System.out.print("Introduce la longitud de la serpiente: ");
    int altura = Integer.parseInt(System.console().readLine());
    // variables
    int posicion = (int) (Math.random() * 3) + 1;
    String cabeza = "@";
    String cuerpo = "*";
    int espacios = 13;
    int conteo = 2;
    // Cabeza serpiente
    System.out.println();
    for (int ca = 1; ca < espacios; ca++) {
      System.out.print(" ");
    }
    System.out.println(cabeza);
    // cuerpo
    for (int cu = 1; cu < espacios; cu++) {
      System.out.print(" ");
    }
    System.out.println(cuerpo);
    for (int i = 0; i < altura - 2; i++) {
      do {
        posicion = (int) (Math.random() * 3) + 1;
        switch (posicion) {
          case 1:
            espacios--;
            for (int cu = 1; cu < espacios; cu++) {
              System.out.print(" ");
            }
            System.out.println(cuerpo);
            break;
          case 2:
              espacios = 13;
              for (int cu = 1; cu < espacios; cu++) {
                System.out.print(" ");
              }
              System.out.println(cuerpo);
            break;
          case 3:
            espacios++;
            for (int cu = 1; cu < espacios; cu++) {
              System.out.print(" ");
            }
            System.out.println(cuerpo);
            break;
          default:
            break;
        }
        espacios = 13;
        conteo++;
      } while (conteo < altura - 2);
    }
    System.out.println();
    System.out.print("");
  }
}
