package fc.java.model;

public class Dog extends Animal {
//  public Dog() {
//    super();
//  } 자동으로 컴파일러가 생서해줌
  @Override
  public void eat() {
    System.out.println("강아지는 멍멍 쩝쩝");
  }

}
