import javax.print.event.PrintEvent;

public class Main {
  public static void main(String[] args){
    System.out.println(add(1,2,3));
    System.out.println(add(1,2));
  }
  public static int add(int a, int b) {
    return a + b;
  }
  public static int add(int a, int b, int c) {
    return a + b + c;
  }
}
