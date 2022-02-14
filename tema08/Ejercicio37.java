package tema08;

import java.util.Scanner;

public class Ejercicio37 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.println("CONVERSOR NÚMEROS A MORSE");
    System.out.print("Introduce el número a convertir: ");
    int numero = Integer.parseInt(s.nextLine());

    System.out.println(convierteEnMorse(numero));
    s.close();
  }

  //FUNCION QUE CONVIERTE Nº A MORSE
  /**
   * Convierte un número dado al código morse
   * 
   * @param n numero dado
   * @return el número dado convertido a código morse
   */
  public static String convierteEnMorse(int n) {
    String morse = "";		
		int conteo = Ejercicio01_14.digitos(n);
		long numReves = Ejercicio01_14.voltea(n);
		long numero = 0;
    
		do {
			numero = numReves % 10;
      switch ((char)(numero)){
        case 0:
          morse += "-----";
          break;
          case 1:
          morse += ".----";
          break;
          case 2:
          morse += "..---";
          break;
          case 3:
          morse += "...--";
          break;
          case 4:
          morse += "....-";
          break;
          case 5:
          morse += ".....";
          break;
          case 6:
          morse += "-....";
          break;
          case 7:
          morse += "--...";
          break;
          case 8:
          morse += "---..";
          break;
          case 9:
          morse += "----.";
          break;
        default:
          break;
      }
      conteo--;
			numReves = numReves / 10;
		} while (conteo > 0);
    return morse;
	}  
}


