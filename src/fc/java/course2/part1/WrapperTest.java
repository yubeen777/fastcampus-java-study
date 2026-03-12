package fc.java.course2.part1;

public class WrapperTest {
  public static void main(String[] args) {
    //정수형 변수에 10을 저장하세요.
    int a = 10;
//    Integer aa = new Integer(10)
    Integer aa = 10;//AUTO+Boxing
    System.out.println(aa.intValue());//Unboxing(Integer->int)

    Integer bb = 20;//Auto-boxing Wrapper로 감싸고 자동으로
    int b = bb;
    System.out.println("b = " + b);
    //.intValue();이게 생략 됨 //Auto-unboxing Wrapper을 자동으로 벗겨줘서 int안에 넣을 수 있게 해준다
  }
}
