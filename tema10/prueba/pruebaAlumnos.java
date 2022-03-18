package prueba;
import java.util.ArrayList;
import java.util.Collections;

public class pruebaAlumnos {
  public static void main(String[] args) {
    
    ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
    
    alumnos.add(new Alumno("david", "servia"));
    alumnos.add(new Alumno("alejandro", "cueto"));
    alumnos.add(new Alumno("natalia", "castillo"));
    
    System.out.println(alumnos);
    Collections.sort(alumnos);
    System.out.println(alumnos);

  }
  
}
