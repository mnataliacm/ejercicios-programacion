package tema06.del01_10;
/**
 * Tema 6
 * Ejercicio 03
 * Igual que el anterior pero con la bajara española de 40 cartas.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio03 {
  public static void main(String[] args) {

    System.out.println("___Cartas al azar de la baraja española___");

    int palo = (int)(Math.random() * 4) + 1;
    int carta = (int)(Math.random() * 14) + 1;
    
    System.out.print("Ha salido la carta: ");

    switch (carta) {
      case 1:
        System.out.print("AS");
        break;
      case 11:
        System.out.print("Sota");
        break;
      case 12:
        System.out.print("Caballo");
        break;
      case 13:
        System.out.print("Rey");
        break;
      default:
        System.out.print(carta);
        break;
    }

    switch (palo) {
      case 1:
        System.out.print(" de oros");
        break;
      case 2:
        System.out.print(" de copas");
        break;
      case 3:
       System.out.print(" de espadas");
       break;
      case 4:
        System.out.print(" de bastos");
        break;
      default:
        break;
    }
    System.out.println();

  }
}

