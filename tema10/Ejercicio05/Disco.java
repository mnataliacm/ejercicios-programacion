package tema10.Ejercicio05;

public class Disco implements Comparable<Disco> {
  private int ID;
  private String autor;
  private String titulo;
  private String genero;
  private String duracion;

  public Disco() {
  }

  public Disco(int ID, String autor, String titulo, String genero, String duracion) {
    this.ID = ID;
    this.autor = autor;
    this.titulo = titulo;
    this.genero = genero;
    this.duracion = duracion;
  }

  public int getID() {
    return this.ID;
  }

  public void setID(int ID) {
    this.ID = ID;
  }

  public String getAutor() {
    return this.autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getGenero() {
    return this.genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getDuracion() {
    return this.duracion;
  }

  public void setDuracion(String duracion) {
    this.duracion = duracion;
  }  

  @Override
  public String toString() {
    return " ID: " + ID + "  Autor: " + autor + "  Título: " + titulo + "  Género: " + genero + "  Duración: " + duracion + "\n";
  }

  public int compareTo(Disco discos) {   
    return (this.autor).compareTo(discos.getAutor());
  }
}