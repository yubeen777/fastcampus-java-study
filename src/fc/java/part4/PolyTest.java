package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class PolyTest {
  public static void main(String[] args) {
    //Upcasting으로 객체 생성
    //상속 관계, 재정의(Override),동적 바인드
    //다형성(Messge  Poltmorphism)
    //상위 클래스가 동일한 메시지로 하위클래스를 서로 다르게 동작 시키는 객체지향 원리
    Animal ani = new Dog();
    ani.eat();//실행 시점에서  사용될(호출될) 메서드가 바인딩(동적바인딜)

    ani = new Cat();
    ani.eat();
    //Downcastig
    ((Cat)ani).night();
    //또는
    Cat c = (Cat)ani;
    c.night();

  }
}
