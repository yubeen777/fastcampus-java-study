package fc.java.part4;

import fc.java.model.Animal;
import fc.java.model.Cat;
import fc.java.model.Dog;

public class DogCatUpcastingTest {
  public static void main(String[] args) {


    //업캐스팅을 통해 부모 객체 변수가 자식 객체를 가르키게 한다
    //dog객체를 사용
    Animal ani = new Dog();
    ani.eat();

    Animal ani2 = new Cat();
    ani2.eat();
  }
}
