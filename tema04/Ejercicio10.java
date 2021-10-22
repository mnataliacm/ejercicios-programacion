/**
 * Tema 4
 * Ejercicio 10
 * Programa que nos diga el horóscopo a partir del dia y del mes de nacimiento.
 *
 * @author Natalia Castillo Muñoz
 */
public class Ejercicio10 {
  public static void main(String[] args) {

    System.out.println("__¿Cuál es tu horóscopo?__");
    
    System.out.print("Introduce tu dia de nacimiento: ");
    int dia = Integer.parseInt(System.console().readLine());
    System.out.print("Introduce tu mes de nacimiento: ");
    String mes = System.console().readLine();

    if ((dia >= 21) && (dia <=31) && ("marzo".equals(mes)) || (dia >= 1) && (dia <= 20) && ("abril".equals(mes))) {
      System.out.print("Tu horoscopo es Aries");
    } else if ((dia >= 21) && (dia <=30) && ("abril".equals(mes)) || (dia >= 1) && (dia <= 20) && ("mayo".equals(mes))) {
      System.out.print("Tu horoscopo es Tauro");
    } else if ((dia >= 21) && (dia <=31) && ("mayo".equals(mes)) || (dia >= 1) && (dia <= 21) && ("junio".equals(mes))) {
      System.out.print("Tu horoscopo es Géminis");
    } else if ((dia >= 22) && (dia <=30) && ("junio".equals(mes)) || (dia >= 1) && (dia <= 22) && ("julio".equals(mes))) {
      System.out.print("Tu horoscopo es Cáncer");
    } else if ((dia >= 23) && (dia <=31) && ("julio".equals(mes)) || (dia >= 1) && (dia <= 22) && ("agosto".equals(mes))) {
      System.out.print("Tu horoscopo es Leo");
    }else if ((dia >= 23) && (dia <=31) && ("agosto".equals(mes)) || (dia >= 1) && (dia <= 22) && ("septiembre".equals(mes))) {
      System.out.print("Tu horoscopo es Virgo");
    }else if ((dia >= 23) && (dia <=30) && ("septiembre".equals(mes)) || (dia >= 1) && (dia <= 22) && ("octubre".equals(mes))) {
      System.out.print("Tu horoscopo es Libra");
    }else if ((dia >= 23) && (dia <=31) && ("octubre".equals(mes)) || (dia >= 1) && (dia <= 22) && ("noviembre".equals(mes))) {
      System.out.print("Tu horoscopo es Escorpio");
    }else if ((dia >= 23) && (dia <=30) && ("noviembre".equals(mes)) || (dia >= 1) && (dia <= 21) && ("diciembre".equals(mes))) {
      System.out.print("Tu horoscopo es Sagitario");
    }else if ((dia >= 22) && (dia <=31) && ("diciembre".equals(mes)) || (dia >= 1) && (dia <= 20) && ("enero".equals(mes))) {
      System.out.print("Tu horoscopo es Capricornio");
    }else if ((dia >= 21) && (dia <=31) && ("enero".equals(mes)) || (dia >= 1) && (dia <= 18) && ("febrero".equals(mes))) {
      System.out.print("Tu horoscopo es Acuario");
    }else if ((dia >= 19) && (dia <=29) && ("febrero".equals(mes)) || (dia >= 1) && (dia <= 20) && ("marzo".equals(mes))) {
      System.out.print("Tu horoscopo es Piscis");
    }
    

  }
}
