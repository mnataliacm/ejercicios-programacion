/**
 * Tema 3
 * Ejercicio 8
 * Programa que calcule el salario semanal en base a las horas trabajadas.
 * A razón de 12 euros la hora.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio8 {
  public static void main(String[] args) {
    
    System.out.println("---Calcular el Salario Semanal---");
    
    System.out.print(" Introduce las horas trabajadas: ");
    String numero = System.console().readLine();
    int horas = Integer.parseInt(numero);
    
    double euros = 12;
    double salario = (horas*euros);
    
    System.out.printf(" El salario de esta semana es de: %.2f euros" ,salario);
    
  }
}
