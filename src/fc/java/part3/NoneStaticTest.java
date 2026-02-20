package fc.java.part3;

public class NoneStaticTest {
  public static void main(String[] args) {
    NoneStaticTest t = new NoneStaticTest();
    int a = 10;
    int b = 20;
    int sum = t.hap(a,b);
    System.out.println(sum);

  }
  public int hap(int a, int b) {
    int v = a + b;
    return v;
  };
}
