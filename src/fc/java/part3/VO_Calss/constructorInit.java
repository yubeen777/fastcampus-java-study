package fc.java.part3.VO_Calss;

import fc.java.model.PersonVO2;

public class constructorInit {
  public static void main(String[] args) {
    //생성자 메서드를 통해 PersonVO객체에 이름 ,나이, 전화번호를 저장해보자
    PersonVO2 v2 = new PersonVO2();
    System.out.println(v2.getName() + "\t" + v2.getAge() + "\t" + v2.getPhone());
  }
}
