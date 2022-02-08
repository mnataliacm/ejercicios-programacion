package ejercicios.tema09.b_POOenJava; 
/**
 * Tema 9 
 * Ejercicio 1 probando Caballo.java
 *
 * Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 * instancias y aplicándole algunos métodos
 *
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio01 {
  
  public static void main(String[] args) {

    Caballo rocinante = new Caballo();
    
    System.out.println("Hola caballo");
    rocinante.relincha();
    System.out.println("Vamos a dar una vuelta");
    rocinante.anda("trote");
    System.out.println("¿una carrera?");
    rocinante.anda("galope");
    

  }
}
