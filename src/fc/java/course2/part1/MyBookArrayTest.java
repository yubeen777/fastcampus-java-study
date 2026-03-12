package fc.java.course2.part1;

import fc.java.course2.model2.BookArray;
import fc.java.course2.model2.BookDTO;

public class MyBookArrayTest {
  public static void main(String[] args) {
    //책 3권의 데이터를 배열에 저장하고 출력하시오
    BookArray list = new BookArray();
    //생성자 만들어졌고 이건 BookArray에 있는 생성자 메서드의 내부 로직을 따른다 그결과 배열크기가 5인 배열이 만들어진다
    list.add(new BookDTO("Java","홍길동","한빛",15000));
    list.add(new BookDTO("Python","홍동","대림",16000));
    list.add(new BookDTO("C++","홍길","금빛",17000));

    //방식 1

//    BookDTO vo = list.get(0);
//    System.out.println(vo);
//
//    vo = list.get(1);
//    System.out.println(vo);
//
//    vo = list.get(2);
//    System.out.println(vo);
//   ========================================


    //방식 2
//    System.out.println(list.get(0));
//
//    System.out.println(list.get(1))

//    System.out.println(list.get(2));

    //방식 3
    for (int i=0;i<list.size();i++) {
      System.out.println(list.get(i));
    }



  }
}
