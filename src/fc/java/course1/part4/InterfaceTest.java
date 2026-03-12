package fc.java.course1.part4;

import fc.java.course1.poly.Radio;
import fc.java.course1.poly.RemoCon;
import fc.java.course1.poly.TV;

public class InterfaceTest {
  public static void main(String[] args) {
    RemoCon remo = new Radio();
    remo.chDown();
    remo.chUp();
    remo.volDown();
    remo.volUp();
    remo.internet();
    //라디오는 인터넷이 필요 없는데 부모클래스가 추상 클래스여도 일반 메서드를 만들수 있어 라디오한테도 적용이 된다

    remo = new TV();
    remo.chDown();
    remo.chUp();
    remo.volDown();
    remo.volUp();
    remo.internet();
  }
}
