package tema05.del61_69;
import java.util.Scanner;
/**
 * Tema 5
 * Ejercicio 65
 * Programa que pinta por pantalla una letra A.
 * Pedir altura y la fila en que aparece el palito horizontal
 * Fila debe ser mayor que 1 y menor que la altura total.
 * Mensaje de error.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio65 {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Introduzca la altura de la A (un número mayor o igual a 3): ");
      int altura = Integer.parseInt(s.nextLine());
      if (altura < 3) {
        System.out.println("La altura introducida no es correcta.");
      } else {
        System.out.print("Introduzca la fila del palito horizontal (entre 2 y " + (altura - 1) + "): ");
        int palito = Integer.parseInt(s.nextLine());
        
        if ((palito < 2) || (palito >= altura)) {
          System.out.println("La fila introducida no es correcta.");
        } else {
          System.out.println();
          // Pinta la letra A
          int espaciosIzq = altura - 1;
          int espaciosCentro = 1;
          
          for (int fila = 1; fila <= altura; fila++) {      
            repiteCaracter(" ", espaciosIzq--);
            System.out.print("*");
            if (fila > 1) {
              if (fila == palito) {
                repiteCaracter("*", espaciosCentro);
              } else {
                repiteCaracter(" ", espaciosCentro);
              }
              
              espaciosCentro+=2;
              System.out.print("*");
            }
            System.out.println();
          }
          
        }
      }
    s.close();
    }
    
    public static void repiteCaracter(String c, int n) {
      for (int i = 0; i < n; i++) {
        System.out.print(c);
      }
  }
}
