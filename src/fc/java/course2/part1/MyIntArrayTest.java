package fc.java.course2.part1;

import fc.java.course2.model2.IntArray;

public class MyIntArrayTest {
  public static void main(String[] args) {
    //정수 3개를 배열에 저장하고 출력
    IntArray iA = new IntArray();
    iA.add(1);
    iA.add(2);
    iA.add(3);



//    System.out.println(iA.get(7));
    System.out.println(iA.get(2));
    System.out.println(iA.size());
    System.out.println(iA.length());
  }
}
