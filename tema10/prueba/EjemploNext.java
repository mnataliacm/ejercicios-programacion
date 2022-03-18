package prueba;

import java.util.Scanner;

public class EjemploNext {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Introduzca su nombre, primer apellido y segundo apellido separados por espacio: ");
    
    String nombre = s.next();
    String apellido1 = s.next();
    String apellido2 = s.next();

    System.out.println(apellido1 + " " + apellido2 + " ", nombre);
    
  }
}
