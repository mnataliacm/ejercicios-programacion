package tema04;
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
    
    int horas = Integer.parseInt(System.console().readLine());
    int horaTrabajo = 12;
    int horaExtra = 16;


    if ((horas >= 1) && (horas <= 40)) {
      int salario = (horas * horaTrabajo);
      System.out.println("No tienes horas extras. Tu salario es: " + salario + "€");
    }
    
    if (horas >= 41) {
      int salario = (40 * horaTrabajo + (horas - 40) * horaExtra);
      System.out.println("Si tienes horas extras. Tu salario es: " + salario + "€");
    }
    
  }
}
