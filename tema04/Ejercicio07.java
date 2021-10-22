/**
 * Tema 4
 * Ejercicio 7
 * Programa que calcule la media de 3 notas.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    
    System.out.println("_Calcula la media de 3 notas");
    
    System.out.print("Introduce la 1ª nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la 2ª nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la 3ª nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2 + nota3)/3;
    
    System.out.printf("Tu nota media es: %.1f ", media);
    
  }
}
