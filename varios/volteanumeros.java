/**
 * Programa que da la vuelta a un numero.
 * 
 * @author Natalia Castillo Muñoz
 */
public class volteanumeros {
  public static void main(String[] args) {

    System.out.println("___Programa muestra el complementario de número___");
    System.out.print("Introduce un número: ");
    int numero = Integer.parseInt(System.console().readLine());

    int conteo = 0;
    int numeroDado = numero/10;

    if (numeroDado == 0) {
      conteo = 1;
    } else if ((numeroDado/10) == 0) {
      conteo = 2;
    }  else if ((numeroDado/100) == 0) {
      conteo = 3;
    }  else if ((numeroDado/1000) == 0) {
      conteo = 4;
    }  else if ((numeroDado/10000) == 0) {
      conteo = 5;
    } else {
      System.out.println("El número " + numero + " tiene más de 5 dígitos");
    }
    switch (conteo) {
      case 1:
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
        numero2 = (numero/10)%10;
        int numero3 = numero%10;
        System.out.println("El numero: " + numero + " Ahora es: " + numero3 + numero2 + numero1);
        break;
      case 4:
        System.out.println("");
        numero1 = numero/1000;
        numero2 = (numero/100)%10;
        numero3 = (numero/10)%10;
        int numero4 = numero%10;
        System.out.println("El numero: " + numero + " Ahora es: " + numero4 + numero3 + numero2 + numero1);
        break;
      case 5:
        System.out.println("");
        
        break;
      default:
        System.out.println("");
    }
  }
}
