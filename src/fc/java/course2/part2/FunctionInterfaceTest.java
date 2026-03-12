package fc.java.course2.part2;

import fc.java.course2.model2.MathOperation;

public class FunctionInterfaceTest implements MathOperation {
  public static void main(String[] args) {
    MathOperation mo = new FunctionInterfaceTest();
    int resert = mo.operation(489, 215);
    System.out.println("값 = " + resert);

  }

  @Override
  public int operation(int x, int y) {
    return x+y;
  }
}
