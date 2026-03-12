package fc.java.course2.part1;

import fc.java.course2.model2.BookDTO;

import java.util.ArrayList;

public class ArratListTest {
  public static void main(String[] args) {
    //BOOK 3권을 배열에 저장하고 출력하세요
    //Book[], Object[]
    ArrayList list = new ArrayList();//기본 크기 (10) 안에 쓰면 내가 원하는 크기 이렇게 제공을 해준다
    list.add(new BookDTO("Java","홍길동","한빛",15000));
    list.add(new BookDTO("Python","홍동","대림",16000));
    list.add(new BookDTO("C++","홍길","금빛",17000));


    BookDTO vo = (BookDTO) list.get(0);
    System.out.println(vo);

    vo = (BookDTO) list.get(1);
    System.out.println(vo);

    vo = (BookDTO) list.get(2);
    System.out.println(vo);

    for (int i=0;i<list.size();i++) {
      System.out.println(list.get(i));
    }//여기서 재정의 된 toString()BookDTO의 메서드가 호출 되어 다운캐스팅 안해도 저렇게 써도 호출이 된다
  }
}
