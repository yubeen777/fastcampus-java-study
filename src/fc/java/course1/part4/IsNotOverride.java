package fc.java.course1.part4;

import fc.java.course1.poly.*;

public class IsNotOverride {
  public static void main(String[] args) {

    //제정의를 안했기 때문에 -> 부모가 명령을 내리면 (메세지를 보내면 ) 오작동 한다
    //다형성을 보장하지 않음 -> 그러면 다형성을 보장하려면?(재정의를 장제로 하도록 만들어야 한다)
    //추상 클래스와 인터페이스 등장
    Animal ani = new Dog();
    ani.eat();

    ani = new Cat();
    ani.eat();

//    ani = new Animal; 이건 오류가 난다 왜? 추상화 클래스 이기 때문에
  }
}
