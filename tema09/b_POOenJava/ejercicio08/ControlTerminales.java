package tema09.b_POOenJava.ejercicio08;

public class ControlTerminales {
  public static void main(String[] args) {
    Terminal t1 = new Terminal("111 11 11 11", 0);
    Terminal t2 = new Terminal("222 22 22 22", 0);
    Terminal t3 = new Terminal("333 33 33 33", 0);
    Terminal t4 = new Terminal("444 44 44 44", 0);

    System.out.println(t1);
    System.out.println(t2);
    t1.llama(t2, 320);
    t1.llama(t3, 200);
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
    System.out.println(t4);

    
  }

}
