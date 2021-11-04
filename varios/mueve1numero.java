/**
 * Programa que mueve el dígito más a la izquierda al final del numero.
 * Si es 1 digito no hace nada.
 * 
 * @author Natalia Castillo Muñoz
 */
public class mueve1numero {
  public static void main(String[] args) {

    System.out.println("___Programa muestra el complementario de número___");
    System.out.print("Introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());

    int numeroDado = numero/10;
    int divide = 10;

    if (numeroDado == 0) {
      System.out.println("Un dígito no se puede mover");
    } else if ((numeroDado/10) == 0) {
      divide = 10;
    }  else if ((numeroDado/100) == 0) {
      divide = 100;
    }  else if ((numeroDado/1000) == 0) {
      divide = 1000;
    }  else if ((numeroDado/10000) == 0) {
      divide = 10000;
    } else if ((numeroDado/100000) == 0) {
      divide = 100000;
    } else if ((numeroDado/1000000) == 0) {
      divide = 1000000;
    } else if ((numeroDado/10000000) == 0) {
      divide = 10000000;
    } else {
      System.out.println("El número " + numero + " tiene más de 8 dígitos");
    }
    System.out.println("");
    int numero1 = numero/divide;
    int numero2 = -((numero1*divide)-numero);
    System.out.println("El numero: " + numero + " Ahora es: " + numero2 + numero1);
      
    









    //version larga
    /*if (numeroDado == 0) {
      conteo = 1;
    } else if ((numeroDado/10) == 0) {
      conteo = 2;
    }  else if ((numeroDado/100) == 0) {
      conteo = 3;
    }  else if ((numeroDado/1000) == 0) {
      conteo = 4;
    }  else if ((numeroDado/10000) == 0) {
      conteo = 5;
    } else if ((numeroDado/100000) == 0) {
      conteo = 6;
    } else if ((numeroDado/1000000) == 0) {
      conteo = 7;
    } else if ((numeroDado/10000000) == 0) {
      conteo = 8;
    } else {
      System.out.println("El número " + numero + " tiene más de 8 dígitos");
    }
    switch (conteo) {
      case 1:
      System.out.println("El numero: " + numero + " solo tiene 1 cifra.");
        break;
      case 2:
        System.out.println("");
        int numero1 = numero/10;
        int numero2 = numero%10;
        System.out.println("El numero: " + numero + " Ahora es: " + numero2 + numero1);
        break;
      case 3:
        System.out.println("");
        numero1 = numero/100;
        numero2 = -((numero1*100)-numero);
        System.out.println("El numero: " + numero + " Ahora es: " + numero2 + numero1);
        break;
      case 4:
        System.out.println("");
        numero1 = numero/1000;
        numero2 = -((numero1*1000)-numero);
        System.out.println("El numero: " + numero + " Ahora es: " + numero2 + numero1);
        break;
      case 5:
        System.out.println("");
        numero1 = numero/10000;
        numero2 = -((numero1*10000)-numero);
        System.out.println("El numero: " + numero + " Ahora es: " + numero2 + numero1);
        break;
        case 6:
        System.out.println("");
        numero1 = numero/100000;
        numero2 = -((numero1*100000)-numero);
        System.out.println("El numero: " + numero + " Ahora es: " + numero2 + numero1);
        break;
        case 7:
        System.out.println("");
        numero1 = numero/1000000;
        numero2 = -((numero1*1000000)-numero);
        System.out.println("El numero: " + numero + " Ahora es: " + numero2 + numero1);
        break;
        case 8:
        System.out.println("");
        numero1 = numero/10000000;
        numero2 = -((numero1*10000000)-numero);
        System.out.println("El numero: " + numero + " Ahora es: " + numero2 + numero1);
        break;
      default:
        System.out.println("");
    }*/


  }
}

