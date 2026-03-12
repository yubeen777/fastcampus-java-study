package fc.java.course2.part2;

import fc.java.course2.model2.MathOperation;
import fc.java.course2.model2.MathOperationImpl;

public class FunctionInterfaceTest1 {
  public static void main(String[] args) {
    MathOperation m = new MathOperationImpl();
    int x = m.operation(1, 2);
    System.out.println("결과는? : " + x);

  }
}
