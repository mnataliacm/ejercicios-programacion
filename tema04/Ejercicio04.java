/**
 * Tema 4
 * Ejercicio 4
 * Programa que calcula el salario semanal teniendo en cuenta horas ordinarias y horas extras.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    
    System.out.println("__Programa que te dice el salario semanal__");
    System.out.print("Indica las horas que has trabajado esta semana: ");
    
    String horas = System.console().readLine();
    int h = Integer.parseInt(horas);
    int horaTrabajo = 12;
    int horaExtra = 16;


    if ((h >= 1) && (h <= 40)) {
      int salario = (h*horaTrabajo);
      System.out.println("No tienes horas extras. Tu salario es: " + salario);
    } else if (h >= 41) {
      int salario = (h*horaExtra);
      System.out.println("Si tienes horas extras. Tu salario es: " + salario);
    } 
    
  }
}
