package fc.java.part2.operator;

public class ArithmeticOpertTest {
  public static void main(String[] args) {

    int a = 3625;
    int b = (a%10);
    System.out.println("b : " + b);
    int c = (a/10%10);
    System.out.println("c : " + c);
    int d = (a/100%10);
    System.out.println("d : " + d);
    int e = (a/1000%10);
    System.out.println("e : " + e);

  }
}
