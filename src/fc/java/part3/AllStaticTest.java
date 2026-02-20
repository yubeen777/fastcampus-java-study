package fc.java.part3;

import fc.java.model.AllStatic;

public class AllStaticTest {

  public static void main(String[] args) {

    // 객체 생성 방식 (생성자가 private이면 불가능)
    // AllStatic st = new AllStatic();

    // System.out.println(st.hap(10,20));   // 객체 방식 호출
    // System.out.println(st.max(10,20));
    // System.out.println(st.min(10,20));

    // ✔ static 메서드는 클래스이름.메서드() 로 호출
    System.out.println(AllStatic.hap(10, 20));  // 30
    System.out.println(AllStatic.max(10, 20));  // 20
    System.out.println(AllStatic.min(10, 20));  // 10


    //  System 클래스도 생성자 private (객체 생성 불가)
    // System sys = new System();

    //  Math 클래스도 생성자 private (객체 생성 불가)
    // Math m = new Math();

    // ✔ 자바 API도 동일한 static 유틸 구조
    System.out.println(Math.max(30, 60));  // 60
    System.out.println(Math.min(40, 10));  // 10
  }
}