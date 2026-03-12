package fc.java.course1.part4;

import fc.java.course1.poly.Board;

public class ObjectToString {
  public static void main(String[] args) {
    Board b =  new Board();
    b.setTitle("게시글입니다");
//    System.out.println(b.getTitle());
    System.out.println(b.toString());//fc.java.course1.poly.Board@119d7047 부모의 메서드 이용한거
    System.out.println(b.toString());//재정의를 하면 바뀜
  }
}
