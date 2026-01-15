package fc.java.part3;

public class PersonTest {
  public static void main(String[] args) {

    //Q. 한사람의 데이터를 저장할 변수를 선언하고 객체를 메모리에 생성하시오
    //즉 인스턴스를 만드는 과정
    Person p = new Person();
    p.name = "홍길동";
    p.age = 18;
    p.phone = "010-1111-2222";
    System.out.println(p.name +  "\t " + p.age + " \t" + p.phone);
    p.play();
    p.eat();
    p.walk();
  }


}
