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
    
    int euros = 12;
    int salario = (horas*euros);
    
    System.out.println(" El salario de esta semana es de: " + salario + " euros");
    
  }
}
