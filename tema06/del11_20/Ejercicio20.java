package tema06.del11_20;
/**
 * Tema 6
 * Ejercicio 20
 *  
 * Programa que pinta una cuba con agua. La capacidad la indica el usuario.
 * La cuba se llenará con una cantidad aleatoria de agua, entre 0 y el máximo.
 * El ancho no varia.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio20 {
  public static void main(String[] args) {

    System.out.println("___Programa que pinta una cuba y la rellena con agua___");
    System.out.print("Indique la capacidad de la cuba: ");
    int altura = Integer.parseInt(System.console().readLine());
    //variables
    String cuba = "\033[35m▓\033[0m";
    String agua = "%s\033[104m    \033[0m%s\n";
    int lleno = (int)(Math.random() * altura);
    System.out.println();
    for (int i = 0; i < altura; i++) {
      if (i < (altura - lleno)) {
        System.out.println(cuba + "    " + cuba);
      } else {
        System.out.printf(agua, cuba, cuba);
      }
    }
    for (int i = 0; i < 6; i++) {
      System.out.print(cuba);
    }
    System.out.println();
    System.out.println(lleno);
  }
}

