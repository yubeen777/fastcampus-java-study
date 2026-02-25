package fc.java.model;

public class Cat extends Animal {

  public Cat () {
    super();
  }
  @Override
  public void eat() {
    System.out.println("고냥이는 냥냥 쩝접");
  }


  public void night(){
    System.out.println("눈까리가 반짝 반짝");
  }
}
