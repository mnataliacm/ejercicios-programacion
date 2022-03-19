package tema09.c_ArraysDeObjetos.Ejercicio03;

import java.util.Scanner;

/**
 * Tema 9
 * Ejercicio 3
 * 
 * Crea un CRUD Coleccion de discos. Create, Reader, Update y Delete (crear,
 * leer, modificar y borrar)
 * 
 * @author Natalia Castillo Muñoz
 */
public class ColeccionDiscos {

  public static void main(String[] args) {

    int opcion, hueco = 0, n;
    int limite = 100;
    String codigoD = "", autorD = "", tituloD = "", generoD = "", duracionD = "";
    Scanner s = new Scanner(System.in);
    //crear array y llena el array
    Disco[] cd = new Disco[limite];
    for (int i = 0; i < limite; i++) {
      cd[i] = new Disco();
    }
    
    //listado inicial de discos
    cd[0] = new Disco("D1", "Extremoduro", "Ley Innata", "Rock", "46.15");
    cd[1] = new Disco("D2", "Mecano", "Aidalai", "Pop", "58.45");
    cd[2] = new Disco("D3", "Frank T", "Frankattack", "Hip-Hop", "60,55");
    cd[3] = new Disco("D4", "Björk", "Vespertine", "Alternativa", "75,33");
    cd[4] = new Disco("D5", "The Doors", "L.A. Woman", "Rock", "48,25");

    
    // CRUD
    do {
      // menu
    System.out.println("  Colección de Discos ");
    System.out.println("***********************");
    System.out.println("1. Listado de discos.");
    System.out.println("2. Añadir un disco.");
    System.out.println("3. Modificar un disco.");
    System.out.println("4. Eliminar un disco.");
    System.out.println("5. Salir del programa.");
    System.out.println("***********************");
    System.out.print("Elige una opción: ");
    opcion = s.nextInt();
      switch (opcion) {
        case 1:
          System.out.println("\n Lista de Discos");
          System.out.println("+++++++++++++++++");
          for (int i = 0; i < cd.length; i++) {
            if (!cd[i].getCodigo().equals("LIBRE")) {
              System.out.println(cd[i]);
            } 
          }
          System.out.println("\nNo hay más discos que mostrar\n");
          break;
        case 2:
          System.out.println("\n Disco Nuevo");
          System.out.println("+++++++++++++++++");
          hueco = -1;
          do {
            hueco++;
          } while (!(cd[hueco].getCodigo().equals("LIBRE")));
          System.out.println("Introduce los datos del nuevo disco: ");
          codigoD = "D" + (hueco + 1);
          cd[hueco].setCodigo(codigoD);
          System.out.println("Código: " + codigoD);
          System.out.println("Autor: ");
          autorD = s.nextLine();
          cd[hueco].setAutor(autorD);
          System.out.println("Título: ");
          tituloD = s.nextLine();
          cd[hueco].setTitulo(tituloD);
          System.out.println("Género: ");
          generoD = s.nextLine();
          cd[hueco].setGenero(generoD);
          System.out.println("Duración: ");
          duracionD = s.nextLine();
          cd[hueco].setDuracion(duracionD);
          break;
        case 3:
          System.out.println("\n Modificar Disco");
          System.out.println("+++++++++++++++++");
          System.out.println("Introduce el código del disco que quiere modificar:");
          codigoD = s.nextLine();
          n = -1;
          do {
            n++;
          } while (!((cd[n].getCodigo()).equals(codigoD)));

          System.out.println("Introduce los datos nuevos o pulsa 'enter' para pasar al siguiente: ");
          System.out.println("Autor: " + cd[n].getAutor());
          System.out.print("Nuevo Autor: ");
          autorD = s.nextLine();
          if (!autorD.equals("")) {
            cd[n].setAutor(cd[n].getAutor());
          }
          System.out.println("Título: " + cd[n].getTitulo());
          System.out.print("Nuevo Título: ");
          tituloD = s.nextLine();
          if (!tituloD.equals("")) {
            cd[n].setTitulo(tituloD);
          }
          System.out.println("Género: " + cd[n].getGenero());
          System.out.print("Nuevo Género: ");
          generoD = s.nextLine();
          if (!generoD.equals("")) {
            cd[n].setGenero(generoD);
          }
          System.out.println("Duracion: " + cd[n].getDuracion());
          System.out.print("Nuevo Autor: ");
          duracionD = s.nextLine();
          if (!duracionD.equals("")) {
            cd[n].setDuracion(duracionD);
          }
          break;
        case 4:
          System.out.println("\n Borrar Disco");
          System.out.println("+++++++++++++++++");
          System.out.println("Escribe el código del disco que quieres borrar: ");
          String borra = s.nextLine();

          n = -1;
          do {
            n++;
          } while (!(cd[n].getCodigo().equals(borra)));

          for (int i = 0; i < cd.length; i++) {
            if (cd[n].getCodigo().equals("LIBRE")) {
              System.out.println("No se puede borrar no hay ningún disco con ese código.");
            } else {
              cd[n].setCodigo("LIBRE");
              System.out.println("Disco borrado.");
            }
          }
          break;
        default:
          break;
      }
    } while (opcion != 5);
    s.close();
  }
}
