package tema08;
/**
 * Tema 8
 * 
 * Probando funciones del Ejercicio29_34
 * 
 *
 * @author Natalia Castillo Muñoz
 */
public class probando29_34 {
	public static void main(String[] args) {

		// variables
		// Scanner s = new Scanner(System.in);
		//int n, x, min, max;

//		// Genero array aleatorio
//		int[] array = new int[15];
//		for (int i = 0; i < array.length; i++) {
//			array[i] = (int) (Math.random() * (26)) + 1;
//		}
//		for (int i = 0; i < array.length; i++) {
//			System.out.printf(" %4d ", array[i]);
//			System.out.println("");
//		}
	  //Genero array bidireccional aleatorio
      int[][] array = new int [5][5];
      for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[0].length; j++) {
          array[i][j] = (int)(Math.random() * (26)) + 1;
        }  
      }
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[0].length; j++) {
        System.out.printf(" %4d ", array[i][j]);
      } 
      System.out.println("");
    }
		// int[] f = new int[array.length];
		// int[] c = new int[array[0].length];
		// GENERA ARRAY bi INT
//    System.out.println("GENERAR UN ARRAY BIDIRECIONAL DE ENTEROS");
//    System.out.print("Introduce la cantidad de filas del array: ");
//    f = s.nextInt();
//    System.out.print("Introduce la cantidad de columnas del array: ");
//    c = s.nextInt();
//    System.out.print("Introduce el valor mínimo de los aleatorios: ");
//    min = s.nextInt();
//    System.out.print("Introduce el valor máximo de los aleatorios: ");
//    max = s.nextInt();
//    //variables
//    c = 5;
//    f = 5;
//    min = 5;
//    max = 30;
//
//    System.out.println("El array generado es: ");
//    for (int i = 0; i < array.length; i++) {
//      array = Ejercicio29_34.generaArrayBiInt(f, c, min, max);
//      for (int j = 0; j < array.length; j++) {
//        System.out.print(array[i][j] + " ");
//      }
//      System.out.println("");
//    }

		// devuelve fila del ARRAY bi INT
//    System.out.println("DEVUELVE LA FILA INDICADA");
////    System.out.print("Introduce la fila: ");
////    t = s.nextInt();
//      n = 3;
//      System.out.print("La fila " + n + " es " + "\n" + Arrays.toString(Ejercicio29_34.filaArrayBiInt(array, n)));

		// devuelve columna del ARRAY bi INT
//    System.out.println("DEVUELVE LA COLUMNA INDICADA");
////    System.out.print("Introduce la columna: ");
////    t = s.nextInt();
//      n = 3;
//      System.out.print("La columna " + n + " es " + "\n" + Arrays.toString(Ejercicio29_34.columnaArrayBiInt(array, n)));

		// devuelve coordenadas de un numero n dentro del ARRAY bi INT
//    System.out.println("DEVUELVE LA COORDENADAS DEL NÚMERO n");
////    System.out.print("Introduce número a buscar: ");
		// t = s.nextInt();
//		n = 10;
//		int[] r = Ejercicio29_34.coordenadasArrayBiInt(array, n);
//		System.out.print("Las coordenadas del número " + n + " son ");
//		for (int i = 0; i < r.length; i++) {
//			System.out.print(r[i] + ", ");
//		}
//		System.out.println("");
		// System.out.print("Las coordenadas del número " + n + " son " +
		// Ejercicio29_34.coordenadasArrayBiString(array, n));

		// devuelve punto de silla (min de la linea y max de la columna)
//		System.out.println("INDICA SI ES PUNTO DE SILLA");
//		System.out.print("Introduce número a buscar: ");
//		t = s.nextInt();
//		n = 2;
//		boolean esSilla = Ejercicio29_34.esPuntoDeSilla(array, n);
//		if (esSilla) {
//			System.out.print("El número " + n + " es Punto de Silla");
//		} else {
//			System.out.print("El número " + n + " no es Punto de Silla");
//		}
        
        //Devuelve una diagonal nose neso
//      int f = 1;
//      int c = 3;
//      int[] r = new int[array.length];
//      String direccion = "neso"; //nose
//      r = Ejercicio29_34.diagonal(array, f, c, direccion);
//      System.out.println();
//      for (int i : r) {
//		System.out.print(i + " ");
//	}	
      

    
		System.out.println("");
		
		// n = 2;
		// boolean esSilla = Ejercicio29_34.Array.esPuntoDeSilla(array, n);
		// if (esSilla) {
		// 	System.out.print("El número " + n + " es Punto de Silla");
		// } else {
		// 	System.out.print("El número " + n + " no es Punto de Silla");
		// }
	
	}
}