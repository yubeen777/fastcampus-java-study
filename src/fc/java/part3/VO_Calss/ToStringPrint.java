package fc.java.part3.VO_Calss;

import fc.java.model.PersonVO2;

public class ToStringPrint {
  public static void main(String[] args) {
    //생성자 메서드를 통해 PersonVO객체에 원하는 이름 ,나이, 전화번호를 저장하고 toString() 메서드로 출력하기
    PersonVO2 VO2 = new PersonVO2("임혜빈",26,"010-6666-7777");
    System.out.println(VO2.toString());
  }
}
/*객체를 그냥 출력하면

System.out.println(p);


자바는 내부적으로

p.toString()


을 자동 호출합니다.*/