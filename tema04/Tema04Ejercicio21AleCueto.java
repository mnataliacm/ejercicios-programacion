/**
 * Calcular la nota de un trimestre de Programación.
 * Pide 2 notas, si la media es menor de 5 pregunta por recuperación
 * apto devuelve de nota un 5 y no apto mantiene la media anterior.
 *  
 * 
 * @author Ale Cueto, Natalia Castillo
 */
public class Tema04Ejercicio21AleCueto {
  public static void main(String[] args) {

    System.out.println("_Calcular la nota trimestral_");
    System.out.print("Introduce la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.print("Introduce la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());

    double media = ((nota1 + nota2) / 2);

    if (media < 5) {
      System.out.print("Debes presentarte a la recuperación, dinos cuanto has sacado: ");
      double recuperacion = Double.parseDouble(System.console().readLine());
      if (recuperacion < 5) {
        System.out.printf("lo siento, tu nota es %.2f es decir eres no apto\n", media);
      } else {
        System.out.println("Felicidades, has aprobado la recuperación. Eres apto\n");
      }
    } else {
      System.out.printf("Felicidades, estás aprobado con un %.2f\n", media);
    }
  }
}
