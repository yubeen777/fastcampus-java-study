package fc.java.course1.part4;

import fc.java.course1.model.Animal;
import fc.java.course1.model.Cat;
import fc.java.course1.model.Dog;

public class ObjectCasting {
  public static void main(String[] args) {
    Animal ani = new Dog();
    ani.eat();

    ani = new Cat();
    ani.eat();

    Cat c = (Cat)ani;
    c.night();
    ((Cat) ani).night();

  }
}
