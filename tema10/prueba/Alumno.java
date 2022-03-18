package prueba;
public class Alumno implements Comparable<Alumno> {
  
  private String apellidos;
  private String nombre;
  
  public Alumno(String nombre, String apellidos) {
    this.apellidos = apellidos;
    this.nombre = nombre;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getApellidos() {
    return this.apellidos;
  }

  @Override
  public String toString(){
    return "Apellidos: " + apellidos + " Nombre: " + nombre;
  }

  public int compareTo(Alumno alumnos) {
    return (this.apellidos).compareTo(alumnos.getApellidos());
  }

}

