package fc.java.course1.part4;

import fc.java.course1.model.Animal;
import fc.java.course1.model.Cat;
import fc.java.course1.model.Dog;

public class PolyArrayTest {
  public static void main(String[] args) {
    Dog d = new Dog();
    Cat c = new Cat();
    //Dog,Cat을 저장할 배열을 생성해보자
    //Animal [] ani = {new Dog(), new Cat()};
    // 이 방법도 있고
    Animal [] ani = new Animal[2];
    ani[0] = d;
    ani[1] = c;

    for (int i = 0; i < ani.length; i++){
      ani[i].eat();

      if (ani[i] instanceof Cat){
        ((Cat) ani[i]).night();
      }
    }
  }
}
