package Ejercicio05;
/**
 * Tema 10
 * Ejercicio05
 * 
 * @author Natalia Castillo Muñoz
 */
public class Disco implements Comparable<Disco> {

  private int codigo;
  private String nombre;


  public Disco() {
  }

  
  public Disco(int codigo, String nombre) {
    this.codigo = codigo;
    this.nombre = nombre;
  }
  
  
  public int getCodigo() {
    return this.codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "ID: " + codigo + " Título: " + nombre;

  }

  public int compareTo(Disco discos) {
    return (this.nombre).compareTo(discos.getNombre());
  }

}