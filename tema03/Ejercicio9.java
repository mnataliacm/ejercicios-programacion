package tema03;
/**
 * Tema 3
 * Ejercicio 9
 * Programa que calcule el volumen de un cono según la fórmula V= (PIr²h)/3
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio9 {
  public static void main(String[] args) {
    
    System.out.println("---Calcular el volumen de un cono en centimetros---");
    
    String numero;
    System.out.print("Introduce el radio: ");
    numero = System.console().readLine();
    int radio = Integer.parseInt(numero);
    
    System.out.print("Introduce la altura: ");
    numero = System.console().readLine();
    int altura = Integer.parseInt(numero);
    
    double pi = 3.14159;
    double volumen = pi*(radio*radio)*altura/3;
    
    System.out.printf("El volumen del cono es: %.2f cm³", volumen);
  }
}
