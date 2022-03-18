package c_ArraysDeObjetos.Ejercicio03;

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
    String autorD = "", tituloD = "", generoD = "", duracionD = "";
    Scanner s = new Scanner(System.in);
    Disco[] cd = new Disco[limite];
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
    opcion = Integer.parseInt(s.nextLine());
    // CRUD
    do {
      switch (opcion) {
        case 1:
          System.out.println("\n Lista de Discos");
          System.out.println("+++++++++++++++++");
          for (int i = 0; i < cd.length; i++) {
            if (!cd[i].getCodigo().equals("LIBRE")) {
              System.out.println(cd[i]);
            } else {
              System.out.println("No hay discos que mostrar");
            }
          }
          break;
        case 2:
          System.out.println("\n Disco Nuevo");
          System.out.println("+++++++++++++++++");
          hueco = -1;
          do {
            hueco++;
          } while (!(cd[hueco].getCodigo().equals("LIBRE")));
          System.out.println("Introduce los datos del nuevo disco: ");
          System.out.println("Código: ");
          cd[hueco].setCodigo("D" + hueco);
          System.out.println("Autor: ");
          cd[hueco].setAutor(autorD);
          System.out.println("Título: ");
          cd[hueco].setTitulo(tituloD);
          System.out.println("Género: ");
          cd[hueco].setGenero(generoD);
          System.out.println("Duración: ");
          cd[hueco].setDuracion(duracionD);
          break;
        case 3:
          System.out.println("\n Modificar Disco");
          System.out.println("+++++++++++++++++");
          System.out.println("Introduce el código del disco que quiere modificar:");
          n = -1;
          do {
            n++;
          } while (!(cd[n].getCodigo().equals("LIBRE")));

          System.out.println("Introduce los datos nuevos o pulsa 'enter' para pasar al siguiente: ");
          System.out.println("Autor: " + cd[n].getAutor());
          System.out.print("Nuevo Autor: ");
          autorD = s.nextLine();
          if (!autorD.equals("")) {
            cd[n].setAutor(autorD);
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
