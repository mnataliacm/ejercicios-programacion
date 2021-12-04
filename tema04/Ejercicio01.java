/**
 * Tema 4
 * Ejercicio 1
 * Programa que pide por teclado dia de la semana y diga que asignatura toca a primera hora. 
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    
    String dia;

    System.out.println("__Asignatura que tienes a 1ª hora el dia solicitado__");
    System.out.print("Introduce el día que quieras consultar: ");
    

    dia = System.console().readLine().toLowerCase();
  
    switch (dia) {
      case "lunes":
      case "martes":
        System.out.println("Programación");
        break;
      case "miercoles":
      case "miércoles":
        System.out.println("Sistemas Informáticos");
        break;
      case "jueves":
        System.out.println("Programación");
        break;
      case "viernes":
        System.out.println("Sistemas Informáticos");
        break;
      case "sabado":
      case "sábado":
      case "domingo":
        System.out.println("No hay clase");
        break;
      default:
        System.out.println("No has introducido ningún día");
    }
  }
}

