/**
 * Tema 6
 * Ejercicio 2
 * Programa que muestre al azar un nombre de carta de la baraja francesa
 * 4 palos, 13 cartas, 9 numerales y 4 literales. (A = 1)
 * Convertir numero en string con String.valueOf(n)
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio02 {
  public static void main(String[] args) {

    System.out.println("___Carta al azar de la baraja francesa___");

    int palo = (int)(Math.random() * 4) + 1;
    int carta = (int)(Math.random() * 13) + 1;
    
    System.out.print("Ha salido la carta: ");

    switch (carta) {
      case 1:
        System.out.print("AS");
        break;
      case 11:
        System.out.print("J (Jack)");
        break;
      case 12:
        System.out.print("Q (Queen)");
        break;
      case 13:
        System.out.print("K (King)");
        break;
      default:
        System.out.print(carta);
        break;
    }

    switch (palo) {
      case 1:
        System.out.print(" de picas  ♠");
        break;
      case 2:
        System.out.print(" de corazones ♥");
        break;
      case 3:
       System.out.print(" de diamantes ♦");
       break;
      case 4:
        System.out.print(" de tréboles ♣");
        break;
      default:
        break;
    }
    System.out.println();
  }
}

