package tema09.b_POOenJava.ejercicio09;

public class ControlTerminales {
  public static void main(String[] args) {

    Movil m1 = new Movil("111 11 11 11", "rata");
    Movil m2 = new Movil("222 22 22 22", "mono");
    Movil m3 = new Movil("333 33 33 33", "bisonte");

    System.out.println(m1);
    System.out.println(m2);
    m1.llama(m2, 320);
    m1.llama(m3, 200);
    m2.llama(m3, 550);
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);

  }

}
