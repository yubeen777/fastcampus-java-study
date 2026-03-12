package fc.java.course1.part4;

import fc.java.course1.model.Animal;
import fc.java.course1.model.Cat;
import fc.java.course1.model.Dog;

public class PolyMethodTest {
  public static void main(String[] args) {
    Dog d = new Dog();
    display(d);
    Cat c = new Cat();
    display(c);
  }

  private static void display(Animal ani) {
    ani.eat();
    if (ani instanceof Cat){
      ((Cat) ani).night();
    }
  }

}
