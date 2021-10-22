/**
 * Tema 4
 * Ejercicio 1
 * Programa que pide por teclado dia de la semana y diga que asignatura toca a primera hora.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    
    System.out.println("__Asignatura que tienes a 1ª hora el dia solicitado__");
    System.out.print("Introduce el número que corresponde al día que quieras consultar: ");
  
    int dia = Integer.parseInt(System.console().readLine());
    
    String asignatura;
    
    switch (dia) {
      case 1:
        asignatura = "El lunes tienes a primera hora Programación";
        break;
      case 2:
        asignatura = "El martes tienes a primera hora Programación";
        break;
      case 3:
        asignatura = "El miercoles tienes a primera hora Sistemas Informáticos";
        break;
      case 4:
        asignatura = "El jueves tienes a primera hora Programación";
        break;
      case 5:
        asignatura = "El viernes tienes a primera hora Sistemas Informáticos";
        break;
      case 6:
        asignatura = "El sábado no hay clase";
        break;
      case 7:
        asignatura = "El domingo no hay clase";
        break;
      default:
        asignatura = "ERROR: debes usar un número del 1 al 7";
    }

    System.out.println(asignatura);
  }
}

