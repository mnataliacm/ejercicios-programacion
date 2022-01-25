package tema03;
/**
 * Tema 3
 * Ejercicio 4
 * Solicitar 2 números y mostrar la suma, resta multiplicación y división.
 * 
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio4 {
  public static void main(String[] args) {
    
    String numero;
    
    System.out.print("Introduce un número: ");
    numero = System.console().readLine();
    int numero1 = Integer.parseInt(numero);
    
    System.out.print("Introduce otro número: ");
    numero = System.console().readLine();
    int numero2 = Integer.parseInt(numero);
    
    int suma = numero1 + numero2;
    int resta = numero1 - numero2;
    int multiplicacion = numero1 * numero2;
    int division = numero1 / numero2;
    
    System.out.println( "--Operar con 2 números---");
    
    System.out.print(" La suma es: " + suma + "\n La resta es: " + resta + "\n La multiplicación es: " + multiplicacion + "\n La división es: "+ division);
    
  }
}
