package tema06.del11_20;
/**
 * Tema 6
 * Ejercicio 13
 * Programa que simula la tirada de dos dados.
 * No para hasta que ambos den el mismo resultado.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio13 {
  public static void main(String[] args) {

    System.out.println("___Programa que tira dos dados___");
    System.out.println();
    int dado1 = 0;
    int dado2 = 0;
    do {
      dado1 = (int)(Math.random() * 6) + 1;
      dado2 = (int)(Math.random() * 6) + 1;
      System.out.print(dado1 + "-" + dado2 + ", ");
    } while (dado1 != dado2);
    System.out.println();
    //System.out.println("Los dados tiene el mismo valor: " + dado1 + " y " + dado2);
  }
}

