/**
 * Tema 4 
 * Ejercicio 8
 * Programa que calcule la media de 3 notas e indique la nota del boletín,
 * insuficiente, suficiente, bien, notable o sobresaliente.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio08 {
  public static void main(String[] args) {
    
    System.out.println("_Calcula la media de 3 notas__");
    
    System.out.print("Introduce la 1ª nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la 2ª nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la 3ª nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1 + nota2 + nota3)/3;
    
    if (media < 5) {
      System.out.printf("Tienes un insuficiente, tu nota media es de %.1f ", media);
    } else if ((media >= 5) && (media < 6)) {
       System.out.printf("Tienes un suficiente, tu nota media es de %.1f ", media); 
    } else if ((media >= 6) && (media < 7)) {
       System.out.printf("Tienes un bien, tu nota media es de %.1f ", media); 
    } else if ((media >= 7) && (media < 9)) {
       System.out.printf("Tienes un notable, tu nota media es de %.1f ", media); 
    } else if ((media >= 9) && (media <= 10)) {
       System.out.printf("!Enhorabuena¡ Tienes un sobresaliente, tu nota media es de %.1f ", media); 
    }
    
  }
}
